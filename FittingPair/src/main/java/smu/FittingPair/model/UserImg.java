package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter @Setter @Entity
//@NoArgsConstructor
public class UserImg {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    private String image_url;
    private String created_at ;


    @Builder
    public UserImg(Users users, String image_url, String created_at) {
        this.users = users;
        this.image_url = image_url;
        this.created_at = created_at;
    }

    @Builder
    public static UserImg saveImg (Users users,String imgurl) {
        return UserImg.builder()
                .users(users)
                .image_url(imgurl)
                .created_at(String.valueOf(LocalDateTime.now()))
                .build();
    }

}



