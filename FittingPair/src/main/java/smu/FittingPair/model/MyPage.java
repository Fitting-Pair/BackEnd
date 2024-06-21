package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

@Entity
@Getter @Setter
@RequiredArgsConstructor
public class MyPage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mypage_id")
    private Long mypage_id;



    @OneToMany(mappedBy = "mypage")
    private List<Result> results;


    @OneToOne @JoinColumn(name = "user_id")
    private Users users;

}
