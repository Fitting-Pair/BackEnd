package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName; //닉네임
    @Column(name="phone_number",nullable = false, unique = true)
    private String phoneNumber;
    private String gender;
    private Long height; //키
    private String refreshToken;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Role> roles;

}
