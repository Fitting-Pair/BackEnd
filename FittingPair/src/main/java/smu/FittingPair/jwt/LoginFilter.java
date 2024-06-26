package smu.FittingPair.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import smu.FittingPair.Service.LoginService;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.UnauthorizedException;
import smu.FittingPair.model.CustomUserDetails;
//
////로그인하면 검증
//@AllArgsConstructor
//public class LoginFilter extends UsernamePasswordAuthenticationFilter {
//    private final AuthenticationManager authenticationManager; //여기로넘겨줌
//    private final JWTProvider jwtProvider;
//
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException{
//        String userName = obtainUsername(request);
//        String pw = "";
//        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userName,pw,null);
//        return authenticationManager.authenticate(usernamePasswordAuthenticationToken);
//    }
//
//    // 로그인 성공 시 토큰 발급
//    protected void successfulAuthentication(HttpServletRequest request,HttpServletResponse response, FilterChain chain, Authentication authentication){
//        CustomUserDetails customUserDetails = (CustomUserDetails) authentication.getPrincipal(); //유저 가지고 옴
//        String userName = customUserDetails.getUsername();
//
//        String token = jwtProvider.createAccessToken(userName);
//        response.addHeader("Authorization","Bearer "+ token);
//    }
//    //로그인 실패 시
//    protected void failAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, AuthenticationException failed){
//        throw new UnauthorizedException(ErrorCode.UNAUTHORIZED);
//    }
//
//}
