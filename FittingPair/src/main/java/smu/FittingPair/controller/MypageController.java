package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.dto.UserNewResultDto;
import smu.FittingPair.Service.UserService;
import smu.FittingPair.config.response.BaseResponse;

@RestController
@RequiredArgsConstructor
public class MypageController {
    private final UserService userService;
    @PostMapping("/users/mypage")
    public void addResult(@RequestBody UserNewResultDto userNewResultDto) {
       // userService.addResult(userNewResultDto);
    }

    @GetMapping("/users/mypage/{id}")
    public BaseResponse<?> getMypage(@PathVariable ("id") Long dd){



        return BaseResponse.ok();
    }

}
