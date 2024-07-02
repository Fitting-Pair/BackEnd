package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.UserImgResponseDto;
import smu.FittingPair.service.UserImgService;


@RestController
@RequiredArgsConstructor
public class UserImgController {

    private final UserImgService userImgService;

    // 이미지 추가
    @PostMapping("/usersimg/upload")
    public BaseResponse<?> addUserImg(@RequestBody UserImgResponseDto userImgResponseDto) {
        userImgService.addUserImg(userImgResponseDto);
         return BaseResponse.ok();
    }

}
