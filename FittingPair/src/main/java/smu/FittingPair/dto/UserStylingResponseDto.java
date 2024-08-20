package smu.FittingPair.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import smu.FittingPair.model.BottomClothesItems;
import smu.FittingPair.model.TopClothesItems;
import smu.FittingPair.model.UserClothes;

@Data
@AllArgsConstructor
@Builder
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
