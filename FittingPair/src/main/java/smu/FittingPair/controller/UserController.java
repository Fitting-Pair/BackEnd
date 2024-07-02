package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.service.UserService;
import smu.FittingPair.dto.UserImgDto;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/body/bodytype")
    public void addUserBodyType(@RequestBody RequestUserBodySizeDto requestUserBodySizeDTO) {
        userService.addUserBodySize(requestUserBodySizeDTO);
    }

    // 이미지 추가
    @PostMapping("/usersimg/upload")
    public void addUserImg(@RequestHeader HttpHeaders httpHeaders, @RequestBody UserImgDto userImgDto) {
        userService.addUserImg(httpHeaders.getFirst("token"), userImgDto);
    }

    //마이페이지 추가
//    @PostMapping("/users/mypage")
//    public void addUserResult(@RequestHeader HttpHeaders httpHeaders, @RequestBody UserNewResultRequestDto userNewResultRequestDto) {
//        userService.addUseResult(httpHeaders.getFirst("token"), userNewResultRequestDto);
//    }

}
