package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ClothesDto {
    private String imgUrl;
    private String clothesName;
    private String clothesBrand;

    @Builder
    public ClothesDto(String imgUrl, String clothesName, String clothesBrand) {
        this.imgUrl = imgUrl;
        this.clothesName = clothesName;
        this.clothesBrand = clothesBrand;
    }
}
