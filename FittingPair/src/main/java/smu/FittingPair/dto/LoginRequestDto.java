package smu.FittingPair.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginRequestDto {
    private String phoneNumber;
    public LoginRequestDto(String phoneNumber){this.phoneNumber = phoneNumber;}

}
