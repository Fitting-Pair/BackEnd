package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.dto.UserObjRequestDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.repository.UsersRepository;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserImgService {
    private final UsersRepository usersRepository;
    private final UserImgRepository userImgRepository;
    private final AuthService authService;


    //프론트로부터 사용자 이미지를 받아옴.
    public UserObjRequestDto addUserImg(MultipartFile imgFile) throws IOException {
        Long id = AuthService.currentUserId();
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ErrorCode.USER_NOT_FOUND));

        Path imgePath = Paths.get("/Users/vecherish/Desktop/imgfile", imgFile.getOriginalFilename());

        Files.write(imgePath, imgFile.getBytes());

        UserImg userImg = UserImg.builder()
                .users(user)
                .imageUrl(imgFile.getResource().getFilename())
                .build();

        user.getUserImgs().add(userImg);
        userImgRepository.save(userImg);
        return UserObjRequestDto.to(userImg.getId(), imgFile);
    }

    public void deleteImg(Long id,String savetime){
        UserImg userImg = userImgRepository.deleteFindFile(id, savetime);

        String imageUrl = userImg.getImageUrl();
        String fileName = imageUrl.substring(imageUrl.lastIndexOf("/") + 1);

        Path imagePath = Paths.get("/Users/vecherish/Desktop/imgfile ", fileName);

        try {
            // 로컬 파일 시스템에서 이미지 삭제
            boolean fileDeleted = Files.deleteIfExists(imagePath);
            if (!fileDeleted) {
                throw new NotFoundException(ErrorCode.INVALID_INPUT_VALUE);
            }
        } catch (IOException e) {
            // 예외 처리
            throw new RuntimeException("Failed to delete image file: " + userImg.getImageUrl(), e);
        }

        userImgRepository.delete(userImg);
    }
    @Transactional
    public void putObjPngFile(Long userImgId,MultipartFile file) throws IOException {
        if(file.isEmpty()){
            throw new NotFoundException(ErrorCode.USER_OBJ_NOT_FOUND);
        }
        UserImg userImg = userImgRepository.findById(userImgId).orElseThrow(()->new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND));
        //todo: 라즈베리 파이에 저장하는걸로 수정
        Path imgePath = Paths.get("/Users/vecherish/Desktop/imgfile", file.getOriginalFilename());

        Files.write(imgePath, file.getBytes());

        userImg.setObjFile(file.getResource().getFilename());
    }

}
