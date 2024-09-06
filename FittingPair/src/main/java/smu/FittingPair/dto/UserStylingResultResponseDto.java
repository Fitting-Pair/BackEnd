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
    Long resultId;
    String objFile;
    String bodyTypeName;
    UserBodySizeResponseDto userBodySizeResponseDto;
    String bodyTypeFeature;
    String bodyTypeCareful;
    UserStylingResponseDto userStylingResponseDto;
    String localDate;

    public static UserStylingResultResponseDto from(Result result) {
        return new UserStylingResultResponseDto(result.getId(),result.getObjFileUrl(),
                result.getBodyShapeName(),
                UserBodySizeResponseDto.from(result.getBodySize()),
                result.getBodyShapeFeatures(),
                result.getBodyShapeCareful(),
                UserStylingResponseDto.from(result),
                result.getUserImgCreatedAt());
    }

}
