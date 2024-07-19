package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
public class Clothes {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clothesName;
    private String brand;
    private String clothesCategory;
    private String imageUrl;

    @JoinColumn(name = "bodytype_id")
    private BodyShape bodyShape;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;


    @Builder
    public Clothes(String clothesName, String brand, BodyShape bodyShape, Users users, String imageUrl, String clothesCategory) {
        this.clothesName = clothesName;
        this.brand = brand;
        this.bodyShape = bodyShape;
        this.users = users;
        this.imageUrl = imageUrl;
        this.clothesCategory = clothesCategory;
    }
}
