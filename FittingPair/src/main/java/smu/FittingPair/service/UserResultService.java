package smu.FittingPair.service;

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

    private final UserBodyTypeRepository userBodyTypeRepository;
    private final UserImgRepository userImgRepository;
    private final UserImgService userImgService;
    private final BodyTypeRepository bodyTypeRepository;
    private final ClothesRepository clothesRepository;
    private final BodySizeRepository bodySizeRepository;
    private final AuthService authService;

    public UserResultResponseDto getResultPage(String saveImgTime) {
        Long l = authService.currentUserId();
        UserImg userImg = userImgRepository.findImg(l, saveImgTime);
        Optional<BodySize> byId = bodySizeRepository.findById(userImg.getId());
        BodySize bodySize = byId.get();

        Optional<UserBodyType> byId1 = userBodyTypeRepository.findById(bodySize.getBodysize_id());
        UserBodyType userBodyType = byId1.get();

        Optional<BodyType> byId2 = bodyTypeRepository.findById(userBodyType.getBodyType().getId());
        BodyType bodyType = byId2.get();

        List<TopClothes> topClothes = clothesRepository.findTopClothes(l, "top");
        List<ButtomClothes> buttomClothes = clothesRepository.findButtomClothes(l, "buttom");
        return UserResultResponseDto.to(userBodyType, bodyType, buttomClothes, topClothes);


    }

    public void DeleteMypage(String saveImgTime){
        Long l = authService.currentUserId();

        UserImg userImg = userImgRepository.findImg(l, saveImgTime);

        Optional<BodySize> byId = bodySizeRepository.findById(userImg.getId());
        BodySize bodySize = byId.get();

        Optional<UserBodyType> byId1 = userBodyTypeRepository.findById(bodySize.getBodysize_id());
        UserBodyType userBodyType = byId1.get();

        Optional<BodyType> byId2 = bodyTypeRepository.findById(userBodyType.getId());
        BodyType bodyType = byId2.get();

        List<Clothes> deleterepo = clothesRepository.deleterepo(l, bodyType.getId());


        userBodyTypeRepository.delete(userBodyType);
        clothesRepository.deleteAll(deleterepo);
        bodySizeRepository.delete(bodySize);
        bodyTypeRepository.delete(bodyType);
        userImgService.deleteImg(l,saveImgTime);

    }
}
