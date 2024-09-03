package smu.FittingPair.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import smu.FittingPair.model.BodySize;

@Data @AllArgsConstructor
@Getter @Builder
@NoArgsConstructor @FieldDefaults(level = AccessLevel.PRIVATE)
public class UserBodySizeResponseDto {
    Long height;
    double chestSize;
    double hipSize;
    double shoulderSize;
    double waistSize;
    public static UserBodySizeResponseDto from(BodySize bodySize){
        return UserBodySizeResponseDto.builder()
                .height(bodySize.getHeightSize())
                .chestSize(bodySize.getChestSize())
                .hipSize(bodySize.getHipSize())
                .shoulderSize(bodySize.getShoulderSize())
                .waistSize(bodySize.getWaistSize())
                .build();
    }

}
