package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.service.AuthService;
import smu.FittingPair.dto.SignUpRequestDto;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.service.SignUpService;


@RestController
@RequiredArgsConstructor
public class SignUpController {
    private final SignUpService signUpService;

    @PostMapping("/auth/signup")
    public BaseResponse<?> signup(@RequestBody SignUpRequestDto signUpRequestDto){
        signUpService.signUp(signUpRequestDto);
        return BaseResponse.ok();
    }

}
