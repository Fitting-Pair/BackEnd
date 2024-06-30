package smu.FittingPair.Service;

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
import smu.FittingPair.dto.TokenResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.jwt.JWTProvider;
import smu.FittingPair.model.CustomUserDetails;
import smu.FittingPair.model.Users;


@RequiredArgsConstructor
@Service
public class ReissueTokenService {
    private final UsersRepository usersRepository;
    private final JWTProvider jwtProvider;
    private final RefreshTokenValidator refreshTokenValidator;

    @Transactional
    public TokenResponseDto reissueToken(String refreshToken){
        refreshTokenValidator.validateToken(refreshToken); //유효한지
        refreshTokenValidator.isinBlackList(refreshToken); //이미 로그아웃된 토큰?
        String memberId = jwtProvider.getUserId(refreshToken); //아이디 추출
        //토큰 새로 발급//
        String newAccessToken = jwtProvider.createAccessToken(memberId);
        String newRefreshToken = jwtProvider.createRefreshToken(memberId);

        return TokenResponseDto.to(newAccessToken,newRefreshToken, jwtProvider.getExpiredIn(newAccessToken));

    }

}
