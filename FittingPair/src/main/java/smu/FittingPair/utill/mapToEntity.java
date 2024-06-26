package smu.FittingPair.utill;

import smu.FittingPair.DTO.SignUpRequestDTO;
import smu.FittingPair.model.MyPage;
import smu.FittingPair.model.Users;

//DTO를 entity로
public class mapToEntity {

    public static Users mapToUsersEntity(SignUpRequestDTO signUpRequestDto) {
        return Users.builder()
                .userName(signUpRequestDto.getUserName())
                .height(signUpRequestDto.getHeight())
                .gender(signUpRequestDto.getGender())
                .phoneNumber(signUpRequestDto.getPhoneNumber())
                .build();

    }

    public static MyPage myPageSetUsers(Users users) {
        return MyPage.builder()
                .users(users)
                .build();
    }
}
