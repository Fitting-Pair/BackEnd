package smu.FittingPair.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity @Getter @Setter @RequiredArgsConstructor
public class UserClothers {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userclothes_id")
    private Long userclothes_id;

    @ManyToOne @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne @JoinColumn(name = "result_id")
    private Result results;
}
