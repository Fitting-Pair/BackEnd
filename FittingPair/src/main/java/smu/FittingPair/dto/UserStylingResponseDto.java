package smu.FittingPair.dto;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import smu.FittingPair.model.BottomClothesItems;
import smu.FittingPair.model.TopClothesItems;
import smu.FittingPair.model.UserClothes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserStylingResponseDto {
    UserTopClothesDto userTopClothesDto;
    UserBottomClothesDto userBottomClothesItemsDto;
    public static UserStylingResponseDto from(TopClothesItems topClothesItems, BottomClothesItems bottomClothesItems){
        return UserStylingResponseDto.builder()
                .userTopClothesDto(UserTopClothesDto.builder().name(topClothesItems.getName()).brand(topClothesItems.getBrand()).imageUrl(topClothesItems.getImageUrl()).siteUrl(topClothesItems.getSiteUrl()).build())
                .userBottomClothesItemsDto(UserBottomClothesDto.builder().name(bottomClothesItems.getName()).brand(bottomClothesItems.getBrand()).imageUrl(bottomClothesItems.getImageUrl()).siteUrl(bottomClothesItems.getSiteUrl()).build())
                .build();
    }

    @Data
    @AllArgsConstructor
    @Builder
    public static class UserTopClothesDto{
        String name;
        String brand;
        String imageUrl;
        String siteUrl;
    }
    @Data
    @AllArgsConstructor
    @Builder
    public static class UserBottomClothesDto{
        String name;
        String brand;
        String imageUrl;
        String siteUrl;
    }

}
