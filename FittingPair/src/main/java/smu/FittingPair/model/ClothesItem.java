package smu.FittingPair.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter


class ClothesItem {
    private String imgUrl;
    private String clothesName;
    private String clothesBrand;

    public ClothesItem(String imgUrl, String clothesName, String clothesBrand) {
        this.imgUrl = imgUrl;
        this.clothesName = clothesName;
        this.clothesBrand = clothesBrand;
    }
}
