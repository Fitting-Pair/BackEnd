package smu.FittingPair.dto;

import lombok.Data;

@Data
public class TopClothes {
    private String imageUrl;
    private String clothesName;
    private String brand;
    private String clothesCategory;

    public TopClothes(String imageUrl, String clothesName, String brand) {
        this.clothesCategory = "top";
        this.imageUrl = imageUrl;
        this.clothesName = clothesName;
        this.brand = brand;
    }
}
