package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.service.AuthService;
import smu.FittingPair.service.UserService;
import smu.FittingPair.dto.UserImgDto;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private AuthService authService;

    @PostMapping("/body/bodytype")
    public void addUserBodyType(@RequestBody RequestUserBodySizeDto requestUserBodySizeDTO) {
        userService.addUserBodySize(requestUserBodySizeDTO);
    }

    // 이미지 추가 밑에서 함수로 가져오기 테스트 중
//    @PostMapping("/usersimg/upload")
//    public void addUserImg(@RequestHeader HttpHeaders httpHeaders, @RequestBody UserImgDto userImgDto) {
//        userService.addUserImg(httpHeaders.getFirst("token"), userImgDto);
//    }

    @PostMapping("/usersimg/upload")
    public void addUserImg(@RequestBody UserImgDto userImgDto) {
        //userService.addUserImg(authService.currentUserId(), userImgDto);
        //userService.addUserImg(userImgDto);
        //BaseResponse.ok();
    }



    //마이페이지 추가
//    @PostMapping("/users/mypage")
//    public void addUserResult(@RequestHeader HttpHeaders httpHeaders, @RequestBody UserNewResultRequestDto userNewResultRequestDto) {
//        userService.addUseResult(httpHeaders.getFirst("token"), userNewResultRequestDto);
//    }

}
