package smu.FittingPair.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.util.Lazy;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Entity @Getter @Setter
public class Result {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long result_id;


    @OneToOne @JoinColumn(name = "userbodytype_id")
    private UserBodyType userBodyType_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mypage_id")
    private MyPage mypage;
}
