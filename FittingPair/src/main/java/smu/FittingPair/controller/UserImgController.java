package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.UserImgResponseDto;
import smu.FittingPair.dto.UserObjRequestDto;
import smu.FittingPair.service.UserDataSendService;
import smu.FittingPair.service.UserImgService;

import java.io.IOException;


@RestController
@RequiredArgsConstructor
public class UserImgController {

    private final UserImgService userImgService;
    private final UserDataSendService userDataSendService;

    // 사용자 이미지 추가
    @PostMapping("/userimg/upload")
    public BaseResponse<?> addUserImg(@RequestParam("imageFile") MultipartFile imageFile) throws IOException {;
        userDataSendService.sendImg(userImgService.addUserImg(imageFile));
        return BaseResponse.ok();
    }
}
