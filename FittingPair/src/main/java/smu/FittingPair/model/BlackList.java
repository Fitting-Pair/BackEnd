package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
@Getter
@Entity
public class BlackList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "invalid_refresh_token")
    private String invalidRefreshToken;
    @Column(name = "invalid_access_token")
    private String invalidAccessToken;

    public BlackList(String invalidRefreshToken,String invalidAccessToken){
        this.invalidRefreshToken = invalidRefreshToken;
        this.invalidAccessToken = invalidAccessToken;
    }

}
