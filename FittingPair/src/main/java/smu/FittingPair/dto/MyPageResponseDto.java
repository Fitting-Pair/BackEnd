package smu.FittingPair.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyPageResponseDto {

    private List<UserStylingResultResponseDto> userStylingResultResponseDtos;

}
