package smu.FittingPair.dto;

import lombok.Data;

@Data
public class ButtomClothes {
    private String imageUrl;
    private String clothesName;
    private String brand;
    private String clothesCategory;

    public ButtomClothes(String imageUrl, String clothesName, String brand) {
        this.imageUrl = imageUrl;
        this.clothesName = clothesName;
        this.brand = brand;
        this.clothesCategory = "buttom";
    }
}
