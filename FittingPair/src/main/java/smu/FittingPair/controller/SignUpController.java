package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.Service.SignUpService;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.LoginRequestDto;
import smu.FittingPair.dto.SignUpRequestDto;


@RestController
@RequiredArgsConstructor
public class SignUpController {
    private final SignUpService signUpService;

    @PostMapping("/signup")
    public BaseResponse<?> signup(@RequestBody SignUpRequestDto signUpRequestDto){
        signUpService.signUp(signUpRequestDto);
        return BaseResponse.ok();
    }
    @GetMapping("/users/{id}")
    public BaseResponse<?> getUserInfo(@PathVariable("id") Long id){
        return BaseResponse.ok(signUpService.getUserInfo(id));
    }


}
