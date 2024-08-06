package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.dto.UserNewResultRequestDto;
import smu.FittingPair.service.MyPageService;
import smu.FittingPair.service.UserImgService;
import smu.FittingPair.config.response.BaseResponse;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class MypageController {
    private final MyPageService myPageService;

    //마이페이지 가져오기 (날짜 리스트들)
    @GetMapping("/users/mypage")
        public BaseResponse<?> getMyPage(){
            return BaseResponse.ok(myPageService.getMyPage());
    }


}
