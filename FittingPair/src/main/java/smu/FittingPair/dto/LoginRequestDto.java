package smu.FittingPair.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginRequestDTO {
    private String phoneNumber; //id
    @Builder
    public LoginRequestDTO(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
//    public Users toEntity(){
//        return Users.builder()
//                .phoneNumber(phoneNumber)
//                .build();
//    }
}
