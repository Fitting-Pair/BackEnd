//package smu.FittingPair.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Getter
//@NoArgsConstructor
//public class Clothes {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private String brand;
//    @Enumerated(value = EnumType.STRING)
//    private ClothesCategory clothesCategory;
//    private String imageUrl;
//    private BodyShape bodyShape;
//    private String siteUrl;
//
//    @Builder
//    public Clothes(String name, String brand, BodyShape bodyShape, Users users, String imageUrl,ClothesCategory clothesCategory, String siteUrl) {
//        this.name = name;
//        this.brand = brand;
//        this.bodyShape = bodyShape;
//        this.imageUrl = imageUrl;
//        this.clothesCategory = clothesCategory;
//        this.siteUrl = siteUrl;
//    }
//}
