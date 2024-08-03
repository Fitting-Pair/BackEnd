package smu.FittingPair.model;


import lombok.Getter;

@Getter
public enum ClothesCategory {
    TOP("상의"),
    BOTTOM("하의");
    private final String description;

    ClothesCategory(String description) {
        this.description = description;
    }
}
