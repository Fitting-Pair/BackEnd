package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter @Entity
public class UserImg {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_img_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    private String imageUrl; //실제 사진
    private String objFileUrl; //obj file
    private String createdAt;


    @Builder
    public UserImg(Users users, String imageUrl) {
        this.users = users;
        this.imageUrl = "http://localhost:8080/Ai/sendImg/" + imageUrl;
        this.createdAt = LocalDateTime.now().toString();
    }

    public static UserImg saveImg (Users users,String imgUrl) {
        return UserImg.builder()
                .users(users)
                .imageUrl(imgUrl)
                .build();
    }
    public void setObjFile(String objFileUrl){
        this.objFileUrl = "http://localhost:8080/Ai/sendImg/" + imageUrl;
    }


}



