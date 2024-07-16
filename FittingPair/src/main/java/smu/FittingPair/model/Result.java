package smu.FittingPair.model;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Entity @Getter
public class Result {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long result_id;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userbodytype_id")
    private UserBodyType userBodyType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mypage_id")
    private MyPage mypage;

    @Builder
    public Result(UserBodyType userBodyType_id, MyPage mypage) {
        this.userBodyType = userBodyType_id;
        this.mypage = mypage;
    }
}
