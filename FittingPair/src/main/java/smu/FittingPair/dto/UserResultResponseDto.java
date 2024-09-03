package smu.FittingPair.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import smu.FittingPair.model.BodyShape;
import smu.FittingPair.model.Result;
import smu.FittingPair.model.UserBodyType;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserResultResponseDto {
    // 처음에 옷 목록 주르륵 보여주는 응답 dto
    private Long resultId;
    private String objFile;
    private String bodyTypeName;
    private String bodyTypeFeature;
    private String bodyTypeCareful;
    private ClothesDto clothesDto;
    public static UserResultResponseDto from(Result result) {
        return new UserResultResponseDto(result.getId(),result.getUserImg().getObjFileUrl(),
                result.getUserBodyType().getBodyShape().getName(),
                result.getUserBodyType().getBodyShape().getFeatures(),
                result.getUserBodyType().getBodyShape().getCareful(),
                ClothesDto.to(result.getUserBodyType().getBodyShape()));
    }

}
