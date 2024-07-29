package smu.FittingPair.model;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Entity @Getter
public class Result {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userbodytype_id")
    private UserBodyType userBodyType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mypage_id")
    private MyPage myPage;
    @OneToOne
    @JoinColumn(name = "userImg_id")
    private UserImg userImg;
    @Builder
    public Result(UserBodyType userBodyType, MyPage myPage,UserImg userImg) {
        this.userBodyType = userBodyType;
        this.myPage = myPage;
        this.userImg = userImg;
    }
    public void setMyPage(MyPage myPage){
        this.myPage = myPage;
    }
}
