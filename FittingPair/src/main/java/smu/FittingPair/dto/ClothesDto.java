package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import smu.FittingPair.model.BodyType;
import smu.FittingPair.model.Clothes;
import smu.FittingPair.model.Users;

import java.util.List;

@Getter
@NoArgsConstructor
public class ClothesDto {
    private List<ButtomClothes> buottomClothes;
    private List<TopClothes> topClothes;

    @Builder
    public ClothesDto(List<ButtomClothes> buttomClothes, List<TopClothes> topClothes ) {
        this.buottomClothes = buttomClothes;
        this.topClothes = topClothes;
    }

    public static Clothes addClothes(Users users,BodyType bodyType ,String brand, String clothesName, String imageUrl) {
        return Clothes.builder()
                .users(users)
                .bodyType(bodyType)
                .brand(brand)
                .clothesName(clothesName)
                .imageUrl(imageUrl)
                .build();
    }
}
