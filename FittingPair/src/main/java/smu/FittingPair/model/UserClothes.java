package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Entity
@Getter
@Builder
public class UserClothes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private TopClothesItems topClothesItems;
    @OneToOne
    private BottomClothesItems bottomClothesItems;
}
