package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.dto.UserNewResultRequestDto;
import smu.FittingPair.service.UserService;
import smu.FittingPair.config.response.BaseResponse;

@RestController
@RequiredArgsConstructor
public class MypageController {
    private final UserService userService;
    @PostMapping("/users/mypage")
    public void addResult(@RequestBody UserNewResultRequestDto userNewResultDto) {
       // userService.addResult(userNewResultDto);
    }

    @GetMapping("/users/mypage/{id}")
    public BaseResponse<?> getMypage(@PathVariable ("id") Long dd){

        return BaseResponse.ok();
    }

}
