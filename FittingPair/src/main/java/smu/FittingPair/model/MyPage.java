package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MyPage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mypage_id")
    private Long mypage_id;

    @OneToMany(mappedBy = "mypage")
    private List<Result> results;

    @OneToOne @JoinColumn(name = "user_id")
    private Users users;

    @Builder
    public MyPage(Users users) {
        this.users = users;
    }
}
