package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MyPage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mypage_id")
    private Long mypage_id;


    @OneToOne @JoinColumn(name = "user_id")
    private Users users;

    @Builder
    public MyPage(Users users) {
        this.users = users;
    }

}
