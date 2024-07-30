package smu.FittingPair.service;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.repository.UsersRepository;
import smu.FittingPair.dto.LoginRequestDto;
import smu.FittingPair.dto.LoginResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.jwt.JWTProvider;
import smu.FittingPair.model.CustomUserDetails;
import smu.FittingPair.model.Users;


@RequiredArgsConstructor
@Service
public class AuthService {

    private final UsersRepository usersRepository;
    private final CustomUserDetailService userDetailService;
    private final JWTProvider jwtProvider;
    private final RefreshTokenValidator refreshTokenValidator;

    @Transactional
    public LoginResponseDto login(LoginRequestDto loginRequestDto, HttpServletResponse response){
        //1. 사용자 인증 정보를 생성한다.
        Authentication authentication = getAuthentication(loginRequestDto);
        //2. 인증정보를 Security ContextHolder에 설정한다.
        SecurityContextHolder.getContext().setAuthentication(authentication);
        //3. 디비의 회원 정보와 일치한지 확인.
        Users users = getUser(loginRequestDto);
        //3. 일치하면 토큰을 생성한다. (인가)
        String accessToken = jwtProvider.createAccessToken(Long.toString(users.getId()));
        String refreshToken = jwtProvider.createRefreshToken(Long.toString(users.getId()));

        usersRepository.save(users);

        return LoginResponseDto.to(users,accessToken,refreshToken);
    }
    private Users getUser(LoginRequestDto loginRequestDto) {
        return usersRepository.findByPhoneNumber(loginRequestDto.getPhoneNumber())
                .orElseThrow(()-> new NotFoundException(ErrorCode.USER_NOT_FOUND));
    }

    private Authentication getAuthentication(LoginRequestDto loginRequestDto) {
        UserDetails userDetails = userDetailService.loadUserByUserLogin(loginRequestDto.getPhoneNumber());
        return new UsernamePasswordAuthenticationToken(userDetails,"",userDetails.getAuthorities());
    }

    //현재 로그인한 사용자의 아이디를 가져오는 메서드
    public Long currentUserId(){
      Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
      String id = ((CustomUserDetails) principal).getUsername();
      return Long.parseLong(id);
    }
    @Transactional
    public void logout(String refreshToken,String accessToken){
        //1. 만료된 토큰인가?
        refreshTokenValidator.validateToken(refreshToken);
        //2. 현재 로그인한 사용자와 같은 아이디인지?
        refreshTokenValidator.validateTokenOwner(refreshToken,currentUserId());
        //3. 현재 로그아웃한 토큰에 있는지
        refreshTokenValidator.isinBlackList(refreshToken);
        //로그아웃 처리
        refreshTokenValidator.addBlackList(refreshToken,accessToken);
    }

}
