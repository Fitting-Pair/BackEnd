package smu.FittingPair.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.ButtomClothes;
import smu.FittingPair.dto.TopClothes;
import smu.FittingPair.dto.UserResultResponseDto;
import smu.FittingPair.model.*;
import smu.FittingPair.repository.*;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserResultService {
    //todo: 1. result 완성
//
//    private final UserBodyTypeRepository userBodyTypeRepository;
//    private final UserImgRepository userImgRepository;
//    private final UserImgService userImgService;
//    private final ClothesRepository clothesRepository;
//    private final BodySizeRepository bodySizeRepository;
//    private final AuthService authService;

//    public UserResultResponseDto getResultPage(String saveImgTime) {
//        Long l = authService.currentUserId();
//        UserImg userImg = userImgRepository.findImg(l, saveImgTime);
//        Optional<BodySize> byId = bodySizeRepository.findById(userImg.getId());
//        BodySize bodySize = byId.get();
//
//        Optional<UserBodyType> byId1 = userBodyTypeRepository.findById(bodySize.getId());
//        UserBodyType userBodyType = byId1.get();
//
//        Optional<BodyShape> byId2 = bodyTypeRepository.findById(userBodyType.getFemaleBodyType().getId());
//        BodyShape bodyShape = byId2.get();
//
//        List<TopClothes> topClothes = clothesRepository.findTopClothes(l, "top");
//        List<ButtomClothes> buttomClothes = clothesRepository.findButtomClothes(l, "buttom");
//        return UserResultResponseDto.to(userBodyType, bodyShape, buttomClothes, topClothes);
//
//    }

//    public void DeleteMypage(String saveImgTime){
//        Long l = authService.currentUserId();
//
//        UserImg userImg = userImgRepository.findImg(l, saveImgTime);
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
//        clothesRepository.deleteAll(deleterepo);
//        bodySizeRepository.delete(bodySize);
//        bodyTypeRepository.delete(femaleBodyType);
//        userImgService.deleteImg(l,saveImgTime);
//    }
}
