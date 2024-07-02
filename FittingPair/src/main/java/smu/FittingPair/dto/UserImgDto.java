package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import smu.FittingPair.model.UserImg;

@Setter
@Getter
@RequiredArgsConstructor
public class UserImgDto {
    private String image_url;
}