package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.dto.UserNewResultRequestDto;
import smu.FittingPair.service.MyPageService;
import smu.FittingPair.service.UserImgService;
import smu.FittingPair.config.response.BaseResponse;

@RestController
@RequiredArgsConstructor
public class MypageController {
    private final MyPageService myPageService;
    @PostMapping("/users/mypage")
    public void addResult(@RequestBody UserNewResultRequestDto userNewResultDto) {
       // userService.addResult(userNewResultDto);
    }

    //마이페이지 가져오기
    @GetMapping("/users/mypage")
    public BaseResponse<?> getMypage(){
        myPageService.getMypage();
        return BaseResponse.ok();
    }

}
