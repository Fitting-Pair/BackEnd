package smu.FittingPair.dto;

import lombok.Builder;
import smu.FittingPair.model.Users;

@Builder
public class UserInfoResponseDTO {
    private Long id;
    private String userName;
    private String phoneNumber; //id
    private Long height;
    private String gender;

    public static UserInfoResponseDTO to(Users users){
        return UserInfoResponseDTO.builder()
                .id(users.getId())
                .userName(users.getUserName())
                .phoneNumber(users.getPhoneNumber())
                .height(users.getHeight())
                .gender(users.getGender())
                .build();
    }
}
