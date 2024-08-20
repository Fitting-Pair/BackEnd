package smu.FittingPair.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.UserStylingResponseDto;
import smu.FittingPair.dto.UserStylingRequestDto;
import smu.FittingPair.dto.UserStylingResultResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.*;
import smu.FittingPair.repository.BottomClothesItemRepository;
import smu.FittingPair.repository.ResultRepository;
import smu.FittingPair.repository.TopClothesItemRepository;
import smu.FittingPair.repository.UserClothesRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserClothesService {
    private final UserClothesRepository userClothesRepository;
    private final ResultRepository resultRepository;
    private final BottomClothesItemRepository bottomClothesItemRepository;
    private final TopClothesItemRepository topClothesItemRepository;

    public UserStylingResultResponseDto makeUserStyling(Long resultId, UserStylingRequestDto userStylingRequestDto){
        Result result = resultRepository.findById(resultId).orElseThrow(()-> new NotFoundException(ErrorCode.RESULT_NOT_FOUND));
        BodyShape bodyShape = result.getUserBodyType().getBodyShape();

        BodyShape.TopClothesItem topClothes = decideTopClothes(userStylingRequestDto.getTopName(), bodyShape.getTopClothesItems());
        BodyShape.BottomClothesItem bottomClothes = decideBottomClothes(userStylingRequestDto.getBottomName(), bodyShape.getBottomClothesItems());

        TopClothesItems topClothesItems = TopClothesItems.builder().name(topClothes.getName()).brand(topClothes.getBrand()).imageUrl(topClothes.getImageUrl()).siteUrl(topClothes.getSiteUrl()).build();
        BottomClothesItems bottomClothesItem = BottomClothesItems.builder().name(bottomClothes.getName()).brand(bottomClothes.getBrand()).imageUrl(bottomClothes.getImageUrl()).siteUrl(bottomClothes.getSiteUrl()).build();

        UserClothes userClothes = UserClothes.builder().bottomClothesItems(bottomClothesItem).topClothesItems(topClothesItems).build();
        topClothesItemRepository.save(topClothesItems);
        bottomClothesItemRepository.save(bottomClothesItem);
        //영속성 컨텍스트 - 아직 데베에 저장되지 않는 엔티티를 참조하려고 할 때 발생 주의
        userClothesRepository.save(userClothes);
        result.setUserClothes(userClothes);

        return UserStylingResultResponseDto.to(result);

    }

    private static BodyShape.TopClothesItem decideTopClothes(String topName, List<BodyShape.TopClothesItem> topClothesItems) {
        BodyShape.TopClothesItem topClothes = null;
        for(BodyShape.TopClothesItem topClothesItem: topClothesItems){
            if(topClothesItem.getName().equals(topName)){
                topClothes = topClothesItem;
                break;
            }
        }
        return topClothes;
    }
    private static BodyShape.BottomClothesItem decideBottomClothes(String bottomName, List<BodyShape.BottomClothesItem> bottomClothesItems) {
        BodyShape.BottomClothesItem bottomClothes = null;
        for(BodyShape.BottomClothesItem bottomClothesItem: bottomClothesItems){
            if(bottomClothesItem.getName().equals(bottomName)){
                bottomClothes = bottomClothesItem;
                break;
            }
        }
        return bottomClothes;
    }


}
