package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smu.FittingPair.model.Users;

@Data
@NoArgsConstructor
public class LoginRequestDto {
    private String phoneNumber; //id
    public LoginRequestDto(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}
