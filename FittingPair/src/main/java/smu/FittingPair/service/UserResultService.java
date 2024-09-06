package smu.FittingPair.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.aspectj.weaver.ast.Not;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.dto.*;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.error.exception.UnauthorizedException;
import smu.FittingPair.model.*;
import smu.FittingPair.repository.*;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserResultService {
    private final UserImgRepository userImgRepository;
    private final ResultRepository resultRepository;
    // 체형 측정 결과를 받고 바로 생성. -> Result 새로 생성
    @Transactional
    public void makeResult(UserBodyType userBodyType){
        Users users = userBodyType.getUsers();
        MyPage myPage = getUserImgOrThrow(users);
        UserImg userImg = getUserImgOrThrow(userBodyType);
        Result result = Result.builder()
                .userBodyType(userBodyType)
                .myPage(myPage)
                .userImg(userImg)
                .stylingCompleted(false)
                .build();
        resultRepository.save(result);
        myPage.addResult(result);
    }
    public UserResultResponseDto getResultByImgId(Long id){
        UserImg userImg = userImgRepository.findById(id).orElseThrow(()-> new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND));
        Result result = resultRepository.findByUserImg(userImg).orElseThrow(()->new NotFoundException(ErrorCode.RESULT_NOT_FOUND));
        return UserResultResponseDto.from(result);
    }
    private Users getUserOrThrow(UserBodyType userBodyType){
        Users users = userBodyType.getUsers();
        if(users==null){
            throw new NotFoundException(ErrorCode.USER_NOT_FOUND);
        }
        return users;
    }

    private MyPage getUserImgOrThrow(Users users) {
        return Optional.ofNullable(users)
                .map(Users::getMyPage)
                .orElseThrow(()->new NotFoundException(ErrorCode.MYPAGE_NOT_FOUND));
    }
    private BodyShape getBodyShapeOrThrow(UserBodyType userBodyType) {
        return Optional.ofNullable(userBodyType)
                .map(UserBodyType::getBodyShape)
                .orElseThrow(() -> new NotFoundException(ErrorCode.BODYSHAPE_NOT_FOUND));
    }

    private UserImg getUserImgOrThrow(UserBodyType userBodyType) {
        return Optional.ofNullable(userBodyType)
                .map(UserBodyType::getBodySize)
                .map(BodySize::getUserImg)
                .orElseThrow(() -> new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND));
    }
    public UserStylingResultResponseDto getOneResult(Long id){
        Result result = resultRepository.findById(id).orElseThrow(()-> new NotFoundException(ErrorCode.RESULT_NOT_FOUND));
        if(!AuthService.currentUserId().equals(result.getUserId())){
            throw new UnauthorizedException(ErrorCode.UNAUTHORIZED);
        }
        return UserStylingResultResponseDto.from(result);
    }
    public void deleteResult(Long id){
        resultRepository.delete(resultRepository.findById(id).orElseThrow(()-> new NotFoundException(ErrorCode.RESULT_NOT_FOUND)));
    }
}
