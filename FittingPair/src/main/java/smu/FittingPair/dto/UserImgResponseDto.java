package smu.FittingPair.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;

@Setter
@Getter
@RequiredArgsConstructor
public class UserImgResponseDto {
    private String image_url;
}