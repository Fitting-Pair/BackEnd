package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.Repository.UsersRepository;

@RestController
@RequiredArgsConstructor
public class MypageController {
    private UsersRepository usersRepository;

    //PostMapping("/users/mypage")



}
