package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
@Getter
public class UserClothes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private TopClothesItems topClothesItems;
    @OneToOne
    private BottomClothesItems bottomClothesItems;

}
