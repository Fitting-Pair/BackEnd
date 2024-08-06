package smu.FittingPair.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.UserResultResponseDto;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;
import smu.FittingPair.repository.UserBodyTypeRepository;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.repository.UsersRepository;

import java.util.*;

@Service
@RequiredArgsConstructor
public class MyPageService {
    private final AuthService authService;
    private final UserBodyTypeRepository userBodyTypeRepository;
    private final UserImgRepository userImgRepository;
    //todo: 수정 List<Result>
    public List<UserResultResponseDto> getMyPage(){
        /*1. 현재 요청을 보낸 아이디로 mypage 찾음.
        2. 그 마이페이지에 있는 result List 를 찾음.
        3. result List -> UserResultResponseDto로 만듬.
        4. 그거를 MypageResponseDto에 넣어서 보냄.

         */
    }

}
