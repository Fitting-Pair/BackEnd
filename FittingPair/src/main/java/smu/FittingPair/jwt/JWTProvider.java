package smu.FittingPair.jwt;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import smu.FittingPair.Service.CustomUserDetailService;
import smu.FittingPair.model.CustomUserDetails;
import smu.FittingPair.model.Role;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import static smu.FittingPair.model.Role.ROLE_USER;

@Component
public class JWTProvider {
    private SecretKey secretKey;
    private final String REFRESH_TOKEN_HEADER = "REFRESH_TOKEN";
    private final String ACCESS_TOKEN_HEADER = "ACCESS_TOKEN";
    @Value("${jwt.issuer}")
    private String issuer;
    private final String AUTHORITIES_KEY = "auth";
    private final String BEARER_TYPE = "Bearer";
    private CustomUserDetailService userDetailsService;


    public JWTProvider(@Value("${jwt.secret-key}") String secret){
        this.secretKey = new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), Jwts.SIG.HS256.key().build().getAlgorithm());
    }
    //토큰에서 이름 추출
    public String getUserId(String token){
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload().getSubject();
    }
    //토큰이 만료 되었는지
    public Boolean isExpired(String token){
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload().getExpiration().before(new Date());
    }
    public String getRole(String token){
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload().get("role", String.class);
    }
    public Authentication getAuthentication(String token) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(getUserId(token));
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    //토큰 생성
    public String createAccessToken(String username){
        //30분
        long ACCESS_TOKEN_EXPIRE_TIME = 1000 * 60 * 30;
        return Jwts.builder()
                .subject(username)
                .claim("role","ROLE_USER") //Long id
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()+ ACCESS_TOKEN_EXPIRE_TIME))
                .signWith(secretKey)
                .compact();
    }
    public String createRefreshToken(String username){
        //7일
        long REFRESH_TOKEN_EXPIRE_TIME = 1000 * 60 * 60 * 24 * 7;
        return Jwts.builder()
                .subject(username) //long id
                .claim("role","ROLE_USER")
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()+ REFRESH_TOKEN_EXPIRE_TIME))
                .signWith(secretKey)
                .compact();
    }

}
