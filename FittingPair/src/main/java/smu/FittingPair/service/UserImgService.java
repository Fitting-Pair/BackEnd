package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.dto.UserImgResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.BodySize;
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
import java.util.Optional;

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

        //경로 바꿔야 할듯?
        Path imgePath = Paths.get("/home/imgfile", imgFile.getOriginalFilename());


        Files.write(imgePath, imgFile.getBytes());

        UserImg build = UserImg.builder()
                .users(user)
                .image_url(imgFile.getResource().getFilename())
                .build();

        List<UserImg> dd = new ArrayList<>();
        dd.add(build);

        userImgRepository.saveAll(dd);
    }


}
