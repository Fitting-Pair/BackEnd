package smu.FittingPair.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.Service.AuthService;
import smu.FittingPair.Service.SignUpService;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.LoginRequestDto;


@RestController
@RequiredArgsConstructor
public class LoginController {
    private final AuthService authService;
    private final SignUpService signUpService;
    @PostMapping("/login")
    //todo: 전화번호 하나 뿐인데 굳이 dto로 감싸야 하는지..?
    public BaseResponse<?> login(@RequestBody LoginRequestDto loginRequestDto, HttpServletResponse response){
        return BaseResponse.ok(authService.login(loginRequestDto,response));
    }
    @GetMapping("/users")
    public BaseResponse<?> getUserInfo(){
        return BaseResponse.ok(signUpService.getUserInfo(authService.currentUserId()));
    }
    @PostMapping
    public BaseResponse<?> logout(){

        return BaseResponse.ok();
    }

}
