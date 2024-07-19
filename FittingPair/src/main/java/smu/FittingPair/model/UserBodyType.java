package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor
public class UserBodyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bodytype_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bodysize_id")
    private BodySize bodySize;

    @Enumerated(EnumType.STRING)
    @Column(name = "body_shape")
    private BodyShape bodyShape;

    @OneToOne(mappedBy = "userBodyType", cascade = CascadeType.ALL)
    private Result result;

//    private String imageUrl; // 사용자 체형 결과 이미지 주소
//    private String created_at; // 사용자 체형 이미지 생성 날짜 (날짜로 변환 필요)

    @Builder
    public UserBodyType(Users users, BodySize bodySize, BodyShape bodyShape) {
        this.users = users;
        this.bodySize = bodySize;
//        this.imageUrl = imageUrl;
//        this.created_at = created_at;
        this.bodyShape = bodyShape;
    }


}
