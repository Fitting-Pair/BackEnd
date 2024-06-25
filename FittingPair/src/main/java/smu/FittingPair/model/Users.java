package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users implements UserDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String userName;
    @Column(name="phone_number",nullable = false, unique = true)
    private String phoneNumber;
    private String gender;
    private Long height; //키

    @OneToOne (mappedBy = "users",cascade = CascadeType.PERSIST)
    private MyPage myPage;

    @OneToMany
    private List<UserImg> userImgsList;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<UserClothers> userClothers;

    @OneToMany
    private List<UserBodyType> userBodyTypes;

    @Builder
    public Users(String userName, String phoneNumber, String gender, Long height) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.height = height;
    }


    public void setUsers(MyPage myPage) {
        this.myPage = myPage;
    }


    public void setUsersClothes(List<UserClothers> clothes) {
        this.userClothers = clothes;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("user"));
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return userName;
    }




}
