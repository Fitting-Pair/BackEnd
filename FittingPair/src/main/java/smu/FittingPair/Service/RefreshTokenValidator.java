package smu.FittingPair.Service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.Repository.BlackListRepository;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.AlreadyLogoutException;
import smu.FittingPair.error.exception.TokenExpiredException;
import smu.FittingPair.error.exception.UnauthorizedException;
import smu.FittingPair.jwt.JWTProvider;
import smu.FittingPair.model.BlackList;

@RequiredArgsConstructor
@Transactional
@Service
public class RefreshTokenValidator {
    private final BlackListRepository blackListRepository;
    private final JWTProvider jwtProvider;

    public void validateToken(String refreshToken){
        if(jwtProvider.isExpired(refreshToken)){
            throw new TokenExpiredException(ErrorCode.TOKEN_EXPIRED_ERROR);
        }
    }
    public void validateTokenOwner(String refreshToken,Long id){
        if(id != Long.parseLong(jwtProvider.getUserId(refreshToken))){
            throw new UnauthorizedException(ErrorCode.TOKEN_EXPIRED_ERROR);
        }
    }
    public void isinBlackList(String refreshToken){
        if(blackListRepository.existsByInvalidRefreshToken(refreshToken)){
            throw new AlreadyLogoutException(ErrorCode.ALREADY_LOGGED_OUT_ERROR);
        }
    }
    public void addBlackList(String refreshToken,String accessToken){
        BlackList blackList = new BlackList(refreshToken,accessToken);
        blackListRepository.save(blackList);
    }

}
