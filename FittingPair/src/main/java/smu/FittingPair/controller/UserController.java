package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.config.response.BaseResponse;
//import smu.FittingPair.dto.ClothesDto;
import smu.FittingPair.dto.UserBodySizeRequestDto;
import smu.FittingPair.service.AuthService;
import smu.FittingPair.service.UserBodyTypeService;
import smu.FittingPair.service.UserClothesService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class UserController {


    private AuthService authService;

    private final UserBodyTypeService userBodyTypeService;
    private final UserClothesService userClothesService;

    //userbodytype 엔티티가 저장되며 해당, 유저에 bodytype 장점, 단점도 자동 저장됨 test 중
//    @PostMapping("/body/bodytype")
//    public BaseResponse<?> addUserBodyType(@RequestBody UserBodySizeRequestDto userBodySizeRequestDTO) {
//        userBodyTypeService.addUserBodySize(userBodySizeRequestDTO);
//        return BaseResponse.ok();
//    }


//    //추천의류 넣기
//    @PostMapping("/clothes/clothesImg")
//    public BaseResponse<?> addClothes(@RequestBody ClothesDto clothesDto) {
//        userClothesService.addUserClothes(clothesDto);
//        return BaseResponse.ok();
//    }

}
