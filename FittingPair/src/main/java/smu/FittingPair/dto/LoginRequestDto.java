package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smu.FittingPair.model.Users;

@Data
@NoArgsConstructor
public class LoginRequestDto {
    private String phoneNumber; //id
    @Builder
    public LoginRequestDto(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
//    public Users toEntity(){
//        return Users.builder()
//                .phoneNumber(phoneNumber)
//                .build();
//    }
}
