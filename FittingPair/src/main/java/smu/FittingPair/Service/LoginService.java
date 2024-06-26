package smu.FittingPair.Service;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.Repository.UsersRepository;
import smu.FittingPair.dto.LoginRequestDto;
import smu.FittingPair.dto.LoginResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.jwt.JWTProvider;
import smu.FittingPair.model.Users;


@RequiredArgsConstructor
@Service
public class LoginService {
    private final UsersRepository usersRepository;
    private final CustomUserDetailService userDetailService;
    private final JWTProvider jwtProvider;

    @Transactional
    public LoginResponseDto login(LoginRequestDto loginRequestDto, HttpServletResponse response){
        //1. 사용자 인증 정보를 생성한다.
        UserDetails userDetails = userDetailService.loadUserByUserLogin(loginRequestDto.getPhoneNumber());
        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails,"",userDetails.getAuthorities());

        //2. 인증정보를 Security ContextHolder에 설정한다.
        SecurityContextHolder.getContext().setAuthentication(authentication);

        //3. 디비의 회원 정보와 일치한지 확인.
        Users users = usersRepository.findByPhoneNumber(loginRequestDto.getPhoneNumber())
                .orElseThrow(()-> new NotFoundException(ErrorCode.NOT_FOUND));

        //3. 일치하면 토큰을 생성한다. (인가)
        String accessToken = jwtProvider.createAccessToken(Long.toString(users.getId()));
        String refreshToken = jwtProvider.createRefreshToken(Long.toString(users.getId()));
        System.out.println(accessToken);
        System.out.println(refreshToken);

        //3-1. 회원의 DB에도 저장함.
        users.setRefreshToken(refreshToken);
        usersRepository.save(users);
        //4. refresh Token을 쿠키 생성 및 설정
        setCookie(refreshToken);
        //5. 리턴
        return LoginResponseDto.to(users,accessToken,refreshToken);
    }
    public void setCookie(String refreshToken){
        Cookie cookie = new Cookie("refreshToken",refreshToken);
        cookie.setDomain("localhost");
        cookie.setPath("/"); //쿠키 경로 결정
        cookie.setMaxAge(30*60); //쿠키 유효 시간:30분
        cookie.setSecure(true); //HTTPS
        cookie.setHttpOnly(true); //HTTP에서 수정 불가. (JS에서 불가)
    }
}
