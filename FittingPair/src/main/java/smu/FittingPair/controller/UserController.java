package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.Service.UserService;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.SignUpRequestDto;


@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public BaseResponse<?> signup(@RequestBody SignUpRequestDto signUpRequestDto){
        userService.signUp(signUpRequestDto);
        return BaseResponse.ok();
    }
    @GetMapping("/users/{id}")
    public BaseResponse<?> getUserInfo(@PathVariable Long id){
        return BaseResponse.ok(userService.getUserInfo(id));
    }

}
