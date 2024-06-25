package smu.FittingPair.controller;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.DTO.SignUpRequestDto;
import smu.FittingPair.Repository.UsersRepository;
import smu.FittingPair.model.MyPage;
import smu.FittingPair.model.UserClothers;
import smu.FittingPair.model.Users;
import smu.FittingPair.utill.mapToEntity;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UsersRepository usersRepository;

    @PostMapping("/signUp")
    public void test(@RequestBody SignUpRequestDto signUpRequestDto) {

        System.out.println(signUpRequestDto.getUserName());
        System.out.println(signUpRequestDto.getRequestMyPageDTO());

//        usersRepository.save(users);

    }



}
