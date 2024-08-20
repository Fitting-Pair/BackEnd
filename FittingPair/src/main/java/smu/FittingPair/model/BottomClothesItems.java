package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class BottomClothesItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String imageUrl;
    private String siteUrl;
    @Enumerated(EnumType.STRING)
    private ClothesCategory clothesCategory;
    public BottomClothesItems(){
        this.clothesCategory= ClothesCategory.BOTTOM;
    }

}
