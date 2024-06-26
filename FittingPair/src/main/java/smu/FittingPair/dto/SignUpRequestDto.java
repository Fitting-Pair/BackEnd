package smu.FittingPair.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignUpRequestDTO {
    private String userName;
    private String phoneNumber; //id
    private Long height;
    private String gender;

    @Builder
    public SignUpRequestDTO(String userName, String phoneNumber, Long height, String gender){
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.height = height;
        this.gender = gender;
    }

}
