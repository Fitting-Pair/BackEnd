package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter @Entity
@RequiredArgsConstructor
public class UserBodyType {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userbodytype_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "user_id")
    private Users users;

    @OneToOne
    @JoinColumn(name = "bodysuze_id")
    private BodySize bodySize;

    private String imageUrl; // 사용자 체형 결과 이미지 주소
    private String created_at; // 사용자 체형 이미지 생성 날짜 (날짜로 변환 필요)


}
