package smu.FittingPair.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import smu.FittingPair.model.*;

import java.util.List;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ClothesDto {
    private List<BodyShape.TopClothesItem> topClothesItems;
    private List<BodyShape.BottomClothesItem> bottomClothesItems;

    public static ClothesDto to(BodyShape bodyShape){
        return ClothesDto.builder().topClothesItems(bodyShape.getTopClothesItems())
                .bottomClothesItems(bodyShape.getBottomClothesItems())
                .build();
    }
}
