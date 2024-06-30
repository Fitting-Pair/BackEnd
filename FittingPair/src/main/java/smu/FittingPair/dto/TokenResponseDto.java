package smu.FittingPair.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import smu.FittingPair.model.Users;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter @Setter
public class TokenResponseDto {
    private String accessToken;
    private String refreshToken;
    private Long expiredIn;

    public static TokenResponseDto to(String accessToken, String refreshToken,Long expiredIn){
        return TokenResponseDto.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .expiredIn(expiredIn)
                .build();
    }
}
