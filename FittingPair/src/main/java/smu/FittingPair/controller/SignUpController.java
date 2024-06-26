package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.DTO.SignUpRequestDTO;
import smu.FittingPair.Service.SignUpService;
import smu.FittingPair.config.response.BaseResponse;


@RestController
@RequiredArgsConstructor
public class SignUpController {
    private final SignUpService signUpService;

    @PostMapping("/signup")
    public BaseResponse<?> signup(@RequestBody SignUpRequestDTO signUpRequestDto){
        signUpService.signUp(signUpRequestDto);
        return BaseResponse.ok();
    }
    @GetMapping("/users/{id}")
    public BaseResponse<?> getUserInfo(@PathVariable Long id){
        return BaseResponse.ok(signUpService.getUserInfo(id));
    }
//    @PostMapping("/login")
//    //todo: 전화번호 하나 뿐인데 굳이 dto로 감싸야 하는지..?
//    public BaseResponse<?> login(@RequestBody LoginRequestDto loginRequestDto){
//        login(loginRequestDto);
//    }


}
