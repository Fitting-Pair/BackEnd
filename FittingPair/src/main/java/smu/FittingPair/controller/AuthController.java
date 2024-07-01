package smu.FittingPair.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.Service.AuthService;
import smu.FittingPair.Service.ReissueTokenService;
import smu.FittingPair.Service.SignUpService;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.LoginRequestDto;


@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final SignUpService signUpService;
    private final ReissueTokenService reissueTokenService;
    @PostMapping("/auth/login")
    //todo: 전화번호 하나 뿐인데 굳이 dto로 감싸야 하는지..?
    public BaseResponse<?> login(@RequestBody LoginRequestDto loginRequestDto, HttpServletResponse response){
        return BaseResponse.ok(authService.login(loginRequestDto,response));
    }
    @GetMapping("/users")
    public BaseResponse<?> getUserInfo(){
        return BaseResponse.ok(signUpService.getUserInfo(authService.currentUserId()));
    }
    @PostMapping("/auth/logout")
    public BaseResponse<?> logout(@RequestHeader("Refresh") String refreshToken, @RequestHeader("Authorization") String accessToken){
        if (accessToken.startsWith("Bearer ")) {
            accessToken = accessToken.substring(7);
        }
        authService.logout(refreshToken,accessToken);
        return BaseResponse.ok();
    }
    @GetMapping("/auth/reissue-token")
    public BaseResponse<?> reissueToken(@RequestHeader("Refresh") String refreshToken){
        return BaseResponse.ok(reissueTokenService.reissueToken(refreshToken));
    }

}
