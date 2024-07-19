package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.UserResultResponseDto;
import smu.FittingPair.service.UserResultService;

@RestController
@RequiredArgsConstructor
public class ResultController {
//
//    private final UserResultService userResultService;
//    private final MypageController mypageController;
//
//     //url 형식으로 date (예 http://localhost:8080/result/2024-07-03-07)
//    @GetMapping("/result/{create}")
//    public BaseResponse<?> getResult(@PathVariable("create") String create) {
//        UserResultResponseDto resultPage = userResultService.getResultPage(create);
//        return BaseResponse.ok(resultPage);
//    }

//    // 마이페이지에 사용자 결과 하나 삭제하기
//    @DeleteMapping("/result/{create}")
//    public BaseResponse<?> DeleteMypage(@PathVariable("create") String create){
//        userResultService.DeleteMypage(create);
//        return BaseResponse.ok();
//    }
}
