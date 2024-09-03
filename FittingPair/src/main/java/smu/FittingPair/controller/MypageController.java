package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.dto.MyPageEditDto;
import smu.FittingPair.service.AuthService;
import smu.FittingPair.service.MyPageService;
import smu.FittingPair.util.response.BaseResponse;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class MypageController {
    private final MyPageService myPageService;

    //todo: 마이페이지 가져오기 (날짜 리스트들 별로 하고 싶으면 ㄱㄱ)
    @GetMapping("/mypage")
        public BaseResponse<?> getMyPage(){
            return BaseResponse.ok(myPageService.getMyPage());
    }
    //마이페이지: 내 정보 확인
    @GetMapping("/mypage/info")
    public BaseResponse<?> getUserInfo(){
        return BaseResponse.ok(myPageService.getUserInfo(AuthService.currentUserId()));
    }
    //마이페이지 내 정보 수정
    @PutMapping("/mypage/info")
    public BaseResponse<?> editUserInfo(@RequestBody MyPageEditDto myPageEditDto){
        return BaseResponse.ok(myPageService.editUserInfo(myPageEditDto));
    }
    @DeleteMapping("/users")
    public BaseResponse<?> deleteUser(){
        myPageService.deleteUser();
        return BaseResponse.ok();
    }

}
