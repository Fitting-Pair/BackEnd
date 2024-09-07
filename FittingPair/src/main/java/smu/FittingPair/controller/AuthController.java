package smu.FittingPair.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.service.AuthService;
import smu.FittingPair.service.ReissueTokenService;
import smu.FittingPair.service.SignUpService;
import smu.FittingPair.util.response.BaseResponse;
import smu.FittingPair.dto.LoginRequestDto;


@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final ReissueTokenService reissueTokenService;
    @PostMapping("/auth/login")
    public BaseResponse<?> login(@RequestBody LoginRequestDto loginRequestDto, HttpServletResponse response){
        return BaseResponse.ok(authService.login(loginRequestDto,response));
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
