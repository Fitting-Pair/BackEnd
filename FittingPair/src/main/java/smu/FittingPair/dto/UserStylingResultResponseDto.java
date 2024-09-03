package smu.FittingPair.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import smu.FittingPair.model.Result;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserStylingResultResponseDto {
    //todo: 의류 넣기
    Long resultId;
    String objFile;
    String bodyTypeName;
    UserBodySizeResponseDto userBodySizeResponseDto;
    String bodyTypeFeature;
    String bodyTypeCareful;
    UserStylingResponseDto userStylingResponseDto;
    String localDate;

    public static UserStylingResultResponseDto from(Result result) {
        return new UserStylingResultResponseDto(result.getId(),result.getUserImg().getObjFileUrl(),
                result.getUserBodyType().getBodyShape().getName(),
                UserBodySizeResponseDto.from(result.getUserBodyType().getBodySize()),
                result.getUserBodyType().getBodyShape().getFeatures(),
                result.getUserBodyType().getBodyShape().getCareful(),
                UserStylingResponseDto.from(result.getUserClothes().getTopClothesItems(), result.getUserClothes().getBottomClothesItems()), result.getUserImg().getCreatedAt());
    }

}
