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
//  private String clothesCategory!;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bodytype_id")
    private BodyType bodyType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @Builder
    public Clothes(String clothesName, String brand, BodyType bodyType, Users users) {
        this.clothesName = clothesName;
        this.brand = brand;
        this.bodyType = bodyType;
        this.users = users;
    }
}
