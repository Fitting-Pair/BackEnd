package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bodytype_id")
    private BodyType bodyType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;


    @Builder
    public Clothes(String clothesName, String brand, BodyType bodyType, Users users, String imageUrl, String clothesCategory) {
        this.clothesName = clothesName;
        this.brand = brand;
        this.bodyType = bodyType;
        this.users = users;
        this.imageUrl = imageUrl;
        this.clothesCategory = clothesCategory;
    }
}
