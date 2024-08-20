package smu.FittingPair.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Optional;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyPageEditDto {
    private String userName;
    private Long height;

}
