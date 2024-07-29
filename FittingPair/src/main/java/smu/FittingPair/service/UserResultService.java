package smu.FittingPair.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.aspectj.weaver.ast.Not;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.dto.BodyTypeDto;
import smu.FittingPair.dto.ButtomClothes;
import smu.FittingPair.dto.TopClothes;
import smu.FittingPair.dto.UserResultResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.*;
import smu.FittingPair.repository.*;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserResultService {
    private final UserBodyTypeRepository userBodyTypeRepository;
    private final UserImgRepository userImgRepository;
    private final UserImgService userImgService;
    private final ClothesRepository clothesRepository;
    private final BodySizeRepository bodySizeRepository;
    private final AuthService authService;
    private final ResultRepository resultRepository;
    //웹에서 마이페이지 조회
    public UserResultResponseDto getResult(String saveImgTime) {
        /*
        1. saveTime 파라미터를 받아서 유저 이미지를 찾는다.
        2. 유저 이미지로 만들어둔 바디 사이즈를 찾는다.
        3. 결과지를 반환한다.
         */
        UserImg userImg = userImgRepository.findImg(authService.currentUserId(), saveImgTime).orElseThrow(()->new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND));
        Result result = resultRepository.findByUserImg(userImg).orElseThrow(()->new NotFoundException(ErrorCode.RESULT_NOT_FOUND));
        //todo: 추천 의류 넣기.
        BodyShape bodyShape = Optional.ofNullable(result)
                .map(Result::getUserBodyType)
                .map(UserBodyType::getBodyShape)
                .orElseThrow(()-> new NotFoundException(ErrorCode.BODYSHAPE_NOT_FOUND));
        return UserResultResponseDto.to(userImg.getObjFileUrl(),bodyShape.getName(),bodyShape.getFeatures(),bodyShape.getCareful());

    }
    // 체형 측정 결과를 받고 바로 생성. -> Result 새로 생성
    @Transactional
    public UserResultResponseDto makeResult(Users users,UserBodyType userBodyType){
        MyPage myPage = getUserImgOrThrow(users);
        BodyShape bodyShape = getBodyShapeOrThrow(userBodyType);
        UserImg userImg = getUserImgOrThrow(userBodyType);
        Result result = Result.builder()
                .userBodyType(userBodyType)
                .myPage(myPage) //todo: 의류
                .userImg(userImg)
                .build();
        resultRepository.save(result);
        //응답 리스폰스 생성
        return UserResultResponseDto.to(userImg.getObjFileUrl(),bodyShape.getName(), bodyShape.getCareful(), bodyShape.getFeatures());
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

//todo: 마이페이지 삭제 구현

//    public void DeleteMypage(String saveImgTime){
//
//        UserImg userImg = userImgRepository.findImg(authService.currentUserId(), saveImgTime).orElseThrow(()->new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND));
//
//        Optional<BodySize> byId = bodySizeRepository.findById(userImg.getId());
//        BodySize bodySize = byId.get();
//
//        Optional<UserBodyType> byId1 = userBodyTypeRepository.findById(bodySize.getId());
//        UserBodyType userBodyType = byId1.get();
//
//        Optional<FemaleBodyType> byId2 = bodyTypeRepository.findById(userBodyType.getId());
//        FemaleBodyType femaleBodyType = byId2.get();
//
//        List<Clothes> deleterepo = clothesRepository.deleterepo(l, femaleBodyType.getId());
//
//
//        userBodyTypeRepository.delete(userBodyType);
//        //clothesRepository.deleteAll(deleterepo);
//        bodySizeRepository.delete(bodySize);
//        userImgService.deleteImg(authService.currentUserId(), saveImgTime);
//    }
}
