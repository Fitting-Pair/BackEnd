package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.repository.UsersRepository;
import smu.FittingPair.dto.TokenResponseDto;
import smu.FittingPair.jwt.JWTProvider;


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
