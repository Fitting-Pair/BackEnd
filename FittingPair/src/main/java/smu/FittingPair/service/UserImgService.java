package smu.FittingPair.service;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${aws.s3.bucket}")
    private String bucket;
    private final AmazonS3 amazonS3Client;
    private final String OBJ_DIR = "obj";
    private final String USER_DIR = "user";
    private final AuthService authService;

    //프론트로부터 사용자 이미지를 받아옴.
    public Long addUserImg(MultipartFile imgFile) throws IOException {
        Long id = AuthService.currentUserId();
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ErrorCode.USER_NOT_FOUND));

        //Path imgePath = Paths.get("/Users/vecherish/Desktop/imgfile", imgFile.getOriginalFilename());
        Path imgePath = Paths.get("/home/imgfile", imgFile.getOriginalFilename());
        Files.write(imgePath, imgFile.getBytes());

        UserImg userImg = UserImg.builder()
                .users(user)
                .imageUrl(imgePath.toString())
                .build();

        user.getUserImgs().add(userImg);
        userImgRepository.save(userImg);
        //return UserObjRequestDto.to(userImg.getId(), imgFile);
        return userImg.getId();
    }
    /**
     * Using amazon s3
     * @param file
     * @return userId
     * @throws IOException
     */
    public Long imgFileUpload(MultipartFile file) throws IOException{
        if(file.isEmpty()){
            throw new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND);
        }
        String fileName = file.getOriginalFilename();
        String fileUrl = "https://" + bucket + "/" + USER_DIR + "/" + fileName;

        ObjectMetadata metadata = new ObjectMetadata();

        metadata.setContentType(file.getContentType());
        metadata.setContentLength(file.getSize());

        amazonS3Client.putObject(bucket, USER_DIR + "/" + fileName,file.getInputStream(),metadata);
        Users user = usersRepository.findById(AuthService.currentUserId()).orElseThrow(()-> new NotFoundException(ErrorCode.USER_NOT_FOUND));

        UserImg userImg = UserImg.builder().users(user).imageUrl(fileUrl).build();
        userImgRepository.save(userImg);
        return userImg.getId();
    }

    public void deleteImg(Long id,String savetime){
        UserImg userImg = userImgRepository.deleteFindFile(id, savetime);

        String imageUrl = userImg.getImageUrl();
        String fileName = imageUrl.substring(imageUrl.lastIndexOf("/") + 1);

        //Path imagePath = Paths.get("/Users/vecherish/Desktop/imgfile ", fileName);
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
    @Transactional
    public void putObjPngFile(Long userImgId,MultipartFile file) throws IOException {
        if(file.isEmpty()){
            throw new NotFoundException(ErrorCode.USER_OBJ_NOT_FOUND);
        }
        UserImg userImg = userImgRepository.findById(userImgId).orElseThrow(()->new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND));
        //todo: 라즈베리 파이에 저장하는걸로 수정
        //Path imgePath = Paths.get("/Users/vecherish/Desktop/imgfile", file.getOriginalFilename());
        Path imgePath = Paths.get("/home/objfile", file.getOriginalFilename());
        Files.write(imgePath, file.getBytes());

        userImg.setObjFile(imgePath.toString());
    }
    /**
     * Using amazon s3
     * @param file
     * @return userId
     * @throws IOException
     */
    public void objFileUpload(Long userImgId, MultipartFile file) throws IOException{
        if(file.isEmpty()){
            throw new NotFoundException(ErrorCode.USER_OBJ_NOT_FOUND);
        }
        UserImg userImg = userImgRepository.findById(userImgId).orElseThrow(()->new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND));
        String fileName = file.getOriginalFilename();
        String fileUrl = "https://" + bucket + "/" + OBJ_DIR + "/" + fileName;

        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentType(file.getContentType());
        metadata.setContentLength(file.getSize());

        amazonS3Client.putObject(bucket, OBJ_DIR + "/" + fileName,file.getInputStream(),metadata);
        userImg.setObjFile(fileUrl);
    }

}
