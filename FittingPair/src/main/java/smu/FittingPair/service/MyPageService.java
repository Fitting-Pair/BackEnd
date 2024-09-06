package smu.FittingPair.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.dto.*;
import smu.FittingPair.dto.MyPageEditDto;
import smu.FittingPair.dto.MyPageResponseDto;
import smu.FittingPair.dto.UserInfoResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.*;
import smu.FittingPair.repository.*;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MyPageService {
    private final UsersRepository usersRepository;
    private final MyPageRepository myPageRepository;
    private final ResultRepository resultRepository;
    public MyPageResponseDto getMyPage(){
        Users users = usersRepository.findById(AuthService.currentUserId()).orElseThrow(()-> new NotFoundException(ErrorCode.USER_NOT_FOUND));
        MyPage myPage = myPageRepository.findByUsers(users).orElseThrow(()-> new NotFoundException(ErrorCode.MYPAGE_NOT_FOUND));
        //스타일링 완료된 것
        List<Result> completedResults = filterStylingResult(myPage);
        List<Result> imCompleteResults = filterNotStylingResult(myPage);
        checkImCompleteResult(imCompleteResults);
        List<UserStylingResultResponseDto> userResult = completedResults.stream().map(UserStylingResultResponseDto::from).toList();
        return MyPageResponseDto.builder().userStylingResultResponseDtos(userResult).build();
    }
    private static List<Result> filterStylingResult(MyPage myPage) {
        return Optional.ofNullable(myPage.getResults())
                .orElseThrow(()-> new NotFoundException(ErrorCode.RESULT_NOT_FOUND))
                .stream()
                .filter(Result::isStylingCompleted) //true인것만 필터링
                .toList();
    }

    private static List<Result> filterNotStylingResult(MyPage myPage) {
        return  Optional.ofNullable(myPage.getResults())
                .orElseThrow(()-> new NotFoundException(ErrorCode.RESULT_NOT_FOUND))
                .stream()
                .filter(result -> !result.isStylingCompleted())
                .toList();
    }
    @Transactional
    public void checkImCompleteResult(List<Result> imCompleteResults) {
        if(imCompleteResults.isEmpty()){
            resultRepository.deleteAll(imCompleteResults);
        }
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

        if (myPageEditDto.getUserName() != null) {
            users.setUserName(myPageEditDto.getUserName());
        }

        if (myPageEditDto.getHeight() != null) { //null이 아니면
            users.setHeight(myPageEditDto.getHeight());
        }
        usersRepository.save(users);
        return UserInfoResponseDto.to(users);
    }
    @Transactional
    public void deleteUser(){
        usersRepository.delete(usersRepository.findById(AuthService.currentUserId()).orElseThrow(()->new NotFoundException(ErrorCode.USER_NOT_FOUND)));
    }

}
