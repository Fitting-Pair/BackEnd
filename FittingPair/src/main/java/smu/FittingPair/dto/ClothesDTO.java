package smu.FittingPair.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ClothesDTO {
    private String imgUrl;
    private String clothesName;
    private String clothesBrand;

    @Builder
    public ClothesDTO(String imgUrl, String clothesName, String clothesBrand) {
        this.imgUrl = imgUrl;
        this.clothesName = clothesName;
        this.clothesBrand = clothesBrand;
    }
}
