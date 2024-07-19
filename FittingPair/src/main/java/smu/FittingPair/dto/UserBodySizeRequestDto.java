package smu.FittingPair.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import org.apache.catalina.User;
import smu.FittingPair.model.BodySize;

import javax.management.InvalidAttributeValueException;
import java.util.Map;
import java.util.Objects;

import static org.hibernate.type.descriptor.java.CoercionHelper.toDouble;

@Data
@Getter
@NoArgsConstructor
@Setter
public class UserBodySizeRequestDto {
    private Long userId;
    private UserSize userSize;
    @Data
    @Getter
    @NoArgsConstructor
    public static class UserSize{
        private double chestSize;
        private double hipSize;
        private double shoulderSize;
        private double waistSize;
        @JsonCreator
        public UserSize(
                @JsonProperty("chestSize") double chestSize,
                @JsonProperty("hipSize") double hipSize,
                @JsonProperty("shoulderSize") double shoulderSize,
                @JsonProperty("waistSize") double waistSize) {
            this.chestSize = chestSize;
            this.hipSize = hipSize;
            this.shoulderSize = shoulderSize;
            this.waistSize = waistSize;
        }
    }
    public BodySize toEntity(double chestSize, double hipSize,double shoulderSize, double waistSize){
        return BodySize.builder()
                .chestSize(chestSize)
                .hipSize(hipSize)
                .shoulderSize(shoulderSize)
                .waistSize(waistSize)
                .build();
    }
}
