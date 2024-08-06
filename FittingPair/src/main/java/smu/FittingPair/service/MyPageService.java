package smu.FittingPair.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.MyPageResponseDto;
import smu.FittingPair.dto.UserInfoResponseDto;
import smu.FittingPair.dto.UserResultResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.MyPage;
import smu.FittingPair.model.Result;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;
import smu.FittingPair.repository.MyPageRepository;
import smu.FittingPair.repository.UserBodyTypeRepository;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.repository.UsersRepository;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MyPageService {
    private final AuthService authService;
    private final UserBodyTypeRepository userBodyTypeRepository;
    private final UserImgRepository userImgRepository;
    private final UsersRepository usersRepository;
    private final MyPageRepository myPageRepository;
    //todo: 수정 List<Result>
    public MyPageResponseDto getMyPage(){
        /*1. 현재 요청을 보낸 아이디로 mypage 찾음.
        2. 그 마이페이지에 있는 result List 를 찾음.
        3. result List -> UserResultResponseDto로 만듬.
        4. 그거를 MypageResponseDto에 넣어서 보냄. */
        Users users = usersRepository.findById(AuthService.currentUserId()).orElseThrow(()-> new NotFoundException(ErrorCode.USER_NOT_FOUND));
        MyPage myPage = myPageRepository.findByUsers(users).orElseThrow(()-> new NotFoundException(ErrorCode.MYPAGE_NOT_FOUND));
        List <Result> results = Optional.ofNullable(myPage)
                .map(MyPage::getResults)
                .orElseThrow(()-> new NotFoundException(ErrorCode.RESULT_NOT_FOUND));
        List<UserResultResponseDto> userResultResponseDtos = results.stream().map(UserResultResponseDto::to).toList();
        return MyPageResponseDto.builder().userResultResponseDtos(userResultResponseDtos).build();

    }
    //회원정보
    public UserInfoResponseDto getUserInfo(Long id){
        Optional<Users> OptionalUser = usersRepository.findById(id);
        Users users = OptionalUser.orElseThrow(()-> new NotFoundException(ErrorCode.USER_NOT_FOUND));
        return UserInfoResponseDto.to(users);
    }

}
