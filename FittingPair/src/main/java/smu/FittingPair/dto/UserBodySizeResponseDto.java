package smu.FittingPair.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import smu.FittingPair.model.BodySize;

@Data
@Getter
@NoArgsConstructor @FieldDefaults
public class UserBodySizeResponseDto {
    private double chestSize;
    private double hipSize;
    private double shoulderSize;
    private double waistSize;

}
