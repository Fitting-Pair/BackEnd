package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TopClothesItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String imageUrl;
    private String siteUrl;
    @Enumerated(EnumType.STRING)
    private ClothesCategory clothesCategory;
    public TopClothesItems(){
        this.clothesCategory= ClothesCategory.TOP;
    }


}
