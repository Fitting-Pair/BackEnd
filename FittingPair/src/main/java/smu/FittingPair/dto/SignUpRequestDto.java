package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smu.FittingPair.model.Users;

@Data
@NoArgsConstructor
public class SignUpRequestDto {
    private String userName;
    private String phoneNumber; //id
    private Long height;
    private String gender;

    @Builder
    public SignUpRequestDto(String userName, String phoneNumber, Long height, String gender){
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.height = height;
        this.gender = gender;
    }
    public Users toEntity(){
        return Users.builder()
                .userName(userName)
                .height(height)
                .gender(gender)
                .phoneNumber(phoneNumber)
                .build();

    }


}
