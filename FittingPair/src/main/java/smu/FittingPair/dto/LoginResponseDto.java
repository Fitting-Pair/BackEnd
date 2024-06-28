package smu.FittingPair.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import smu.FittingPair.model.Users;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter @Setter
public class LoginResponseDto {
    private Long id;
    private String userName;
    private String accessToken;
    private String refreshToken;

    public static LoginResponseDto to(Users users,String accessToken,String refreshToken){
        return LoginResponseDto.builder()
                .id(users.getId())
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
    }
}
