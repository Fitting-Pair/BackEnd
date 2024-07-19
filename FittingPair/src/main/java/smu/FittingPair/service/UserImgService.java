package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
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
    public void addUserImg(MultipartFile imgFile) throws IOException {
        Long id = authService.currentUserId();
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ErrorCode.USER_NOT_FOUND));

        Path imgePath = Paths.get("/home/imgfile", imgFile.getOriginalFilename());

        Files.write(imgePath, imgFile.getBytes());

        UserImg build = UserImg.builder()
                .users(user)
                .image_url(imgFile.getResource().getFilename())
                .build();

        List<UserImg> dd = new ArrayList<>();
        dd.add(build);
        user.setUserImg(dd);

        userImgRepository.saveAll(dd);
    }

    public void deleteImg(Long id,String savetime){
        UserImg userImg = userImgRepository.deleteFindFile(id, savetime);

        String imageUrl = userImg.getImageUrl();
        String fileName = imageUrl.substring(imageUrl.lastIndexOf("/") + 1);

        Path imagePath = Paths.get("/home/imgfile", fileName);

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

}
