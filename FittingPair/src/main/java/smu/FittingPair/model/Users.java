package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String userName;
    private String phoneNumber;
    private String gender;
    private Long height; //키

    @OneToMany
    private List<UserImg> userImgsList;


    @OneToOne (mappedBy = "users",cascade = CascadeType.PERSIST)
    private MyPage myPage;

    @OneToMany
    private List<UserClothers> userClothers;

    @OneToMany
    private List<UserBodyType> userBodyTypes;
}
