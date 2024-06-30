package smu.FittingPair.jwt;


import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import smu.FittingPair.Repository.BlackListRepository;
import smu.FittingPair.Service.CustomUserDetailService;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
public class JWTProvider {
    private final String REFRESH_TOKEN_HEADER = "REFRESH_TOKEN";
    private final String ACCESS_TOKEN_HEADER = "ACCESS_TOKEN";
    @Value("${jwt.issuer}")
    private String issuer;
    private final String AUTHORITIES_KEY = "auth";
    private final String BEARER_TYPE = "Bearer";
    private CustomUserDetailService userDetailsService;
    private SecretKey secretKey;
    private final BlackListRepository blackListRepository;
    public JWTProvider(@Value("${jwt.secret-key}") String secret, CustomUserDetailService customUserDetailService, BlackListRepository blackListRepository){
        secretKey = new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8),Jwts.SIG.HS256.key().build().getAlgorithm());
        this.userDetailsService = customUserDetailService;
        this.blackListRepository = blackListRepository;
    }
    //토큰에서 이름 추출
    public String getUserId(String token){
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload().get("id",String.class);
    }
    //토큰이 만료 되었는지
    public Boolean isExpired(String token){
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload().getExpiration().before(new Date());
    }
    //토큰이 블랙 리스트에 있는지
    public Boolean isInBlackList(String token){
        return blackListRepository.existsByInvalidAccessToken(token);
    }
    public String getRole(String token){
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload().get("role", String.class);
    }
    public Long getExpiredIn(String token){
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload().getExpiration().getTime();
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
                .claim("id",username)
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
                .claim("id",username)
                .claim("role","ROLE_USER")
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()+ REFRESH_TOKEN_EXPIRE_TIME))
                .signWith(secretKey)
                .compact();
    }

}
