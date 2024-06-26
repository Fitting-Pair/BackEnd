//package smu.FittingPair.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import smu.FittingPair.Service.SignUpService;
//import smu.FittingPair.config.response.BaseResponse;
//import smu.FittingPair.dto.LoginRequestDto;
//
//
//@RestController
//@RequiredArgsConstructor
//public class LoginController {
//    private final SignUpService signUpService;
//
//    @PostMapping("/login")
//    //todo: 전화번호 하나 뿐인데 굳이 dto로 감싸야 하는지..?
//    public BaseResponse<?> login(@RequestBody LoginRequestDto loginRequestDto){
//        login(loginRequestDto);
//    }
//
//
//}
