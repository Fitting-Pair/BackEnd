package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.ClothesDto;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.dto.UserImgResponseDto;
import smu.FittingPair.service.AuthService;
import smu.FittingPair.service.UserBodySizeService;
import smu.FittingPair.service.UserClothesService;
import smu.FittingPair.service.UserImgService;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class UserController {


    private AuthService authService;

    private final UserBodySizeService userBodySizeService;
    private final UserClothesService userClothesService;

    //해당 유저에 bodytype 장점, 단점 저장
    @PostMapping("/body/bodytype")
    public BaseResponse<?> addUserBodyType(@RequestBody RequestUserBodySizeDto requestUserBodySizeDTO) {
        userBodySizeService.addUserBodySize(requestUserBodySizeDTO);
        return BaseResponse.ok();
    }


    //추천의류 넣기
    @PostMapping("/clothes/clothesImg")
    public BaseResponse<?> addClothes(@RequestBody ClothesDto clothesDto) {
        userClothesService.addUserClothes(clothesDto);
        return BaseResponse.ok();
    }


    //마이페이지 추가
//    @PostMapping("/users/mypage")
//    public void addUserResult(@RequestHeader HttpHeaders httpHeaders, @RequestBody UserNewResultRequestDto userNewResultRequestDto) {
//        userService.addUseResult(httpHeaders.getFirst("token"), userNewResultRequestDto);
//    }

}
