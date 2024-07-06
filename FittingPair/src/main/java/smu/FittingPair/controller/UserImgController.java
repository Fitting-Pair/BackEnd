package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.UserImgResponseDto;
import smu.FittingPair.service.UserImgService;

import java.io.IOException;


@RestController
@RequiredArgsConstructor
public class UserImgController {

    private final UserImgService userImgService;

    // 사용자 이미지 추가
    @PostMapping("/usersimg/upload")
    public BaseResponse<?> addUserImg(@RequestParam("imageFile") MultipartFile imageFile) throws IOException {;
        userImgService.addUserImg(imageFile);
         return BaseResponse.ok();
    }
}
