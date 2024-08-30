package smu.FittingPair.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import smu.FittingPair.model.Result;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserStylingResultResponseDto {
    //todo: 의류 넣기
    private Long resultId;
    private String objFile;
    private String bodyTypeName;
    private String bodyTypeFeature;
    private String bodyTypeCareful;
    private UserStylingResponseDto userStylingResponseDto;

    public static UserStylingResultResponseDto to(Result result) {
        return new UserStylingResultResponseDto(result.getId(),result.getUserImg().getObjFileUrl(),
                result.getUserBodyType().getBodyShape().getName(),
                result.getUserBodyType().getBodyShape().getFeatures(),
                result.getUserBodyType().getBodyShape().getCareful(),
                UserStylingResponseDto.from(result.getUserClothes().getTopClothesItems(), result.getUserClothes().getBottomClothesItems()));
    }

}
