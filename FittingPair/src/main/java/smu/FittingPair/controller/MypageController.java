package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.dto.UserNewResultRequestDto;
import smu.FittingPair.service.MyPageService;
import smu.FittingPair.service.UserImgService;
import smu.FittingPair.config.response.BaseResponse;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class MypageController {
    private final MyPageService myPageService;

    //둘다 아직 작성보류

    //마이페이지에 결과 추가
    @PostMapping("/users/mypage")
    public void addResult(@RequestBody UserNewResultRequestDto userNewResultDto) {
       // userService.addResult(userNewResultDto);
    }

    //마이페이지 가져오기 (날짜 리스트들)
    @GetMapping("/users/mypage")
    public BaseResponse<?> getMypage(){
        myPageService.getMypage();
        return BaseResponse.ok();
    }
    // 마이페이지에 사용자 결과 가져오기
    // @GetMapping("/result"){

    // 마이페이지에 사용자 결과 삭제하기
    // @DeleteMapping("/result"){

}
