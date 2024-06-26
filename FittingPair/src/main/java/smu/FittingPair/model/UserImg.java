package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import smu.FittingPair.DTO.MypageResponseDTO;

import java.time.LocalDate;

@RequiredArgsConstructor
@Getter @Setter @Entity
public class UserImg {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    private String image_rul;
    private String created_at ;


    @Builder
    public UserImg(Users users, String image_rul, String created_at) {
        this.users = users;
        this.image_rul = image_rul;
        this.created_at = created_at;
    }


    // Users에 userImg 넣기
    public static UserImg saveImg (Users users,String imgurl) {
        return UserImg.builder()
                .users(users)
                .image_rul(imgurl)
                .build();
    }

}



