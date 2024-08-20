package smu.FittingPair.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.dto.*;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.*;
import smu.FittingPair.repository.*;

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
    private final BodySizeRepository bodySizeRepository;
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
        List<UserStylingResultResponseDto> userResult = results.stream().map(UserStylingResultResponseDto::to).toList();
        return MyPageResponseDto.builder().userStylingResultResponseDtos(userResult).build();

    }
    //회원정보
    public UserInfoResponseDto getUserInfo(Long id){
        Optional<Users> OptionalUser = usersRepository.findById(id);
        Users users = OptionalUser.orElseThrow(()-> new NotFoundException(ErrorCode.USER_NOT_FOUND));
        return UserInfoResponseDto.to(users);
    }
    @Transactional
    public UserInfoResponseDto editUserInfo(MyPageEditDto myPageEditDto) {
        Users users = usersRepository.findById(AuthService.currentUserId()).orElseThrow(() -> new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND));
        //MyPage myPage = myPageRepository.findByUsers(users).orElseThrow(()-> new NotFoundException(ErrorCode.MYPAGE_NOT_FOUND);
        if (!myPageEditDto.getUserName().isEmpty()) {
            users.setUserName(myPageEditDto.getUserName());
        }
        if (!myPageEditDto.getPhoneNumber().isEmpty()) {
            users.setPhoneNumber(myPageEditDto.getPhoneNumber());
        }
        if (!myPageEditDto.getGender().isEmpty()) {
            users.setGender(myPageEditDto.getGender());
        }
        if (myPageEditDto.getHeight() != null) {
            users.setHeight(myPageEditDto.getHeight());
        }
        usersRepository.save(users);
        return UserInfoResponseDto.to(users);
    }
    @Transactional
    public void deleteUser(){
        usersRepository.delete(usersRepository.findById(AuthService.currentUserId()).orElseThrow(()->new NotFoundException(ErrorCode.USER_NOT_FOUND)));
        //이미지 삭제!

    }

}
