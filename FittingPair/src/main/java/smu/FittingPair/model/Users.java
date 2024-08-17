package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String userName;
    @Column(name="phone_number",nullable = false, unique = true)
    private String phoneNumber;
    private String gender;
    private Long height; //키

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Role> roles;

    @OneToOne(mappedBy = "users",cascade = CascadeType.ALL,orphanRemoval = true)
    private MyPage myPage;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserImg> userImgs;

    @Builder
    public Users(String userName, String phoneNumber, String gender, Long height) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.height = height;
        this.userImgs = new ArrayList<>();
        this.roles = new ArrayList<>();
    }

    public void setMypage(MyPage myPage) {
        this.myPage = myPage;
    }


}
