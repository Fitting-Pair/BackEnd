package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MyPage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "my_page_id")
    private Long id;

    @OneToOne @JoinColumn(name = "user_id")
    private Users users;
    @OneToMany(mappedBy = "myPage",cascade = CascadeType.ALL,orphanRemoval = true)
    private List <Result> results;

    @Builder
    public MyPage(Users users) {
        this.users = users;
        this.results = new ArrayList<>();
    }
    public void addResult(Result result){
        this.results.add(result);
        if(result.getMyPage()!=this){
            result.setMyPage(this);
        }
    }

}
