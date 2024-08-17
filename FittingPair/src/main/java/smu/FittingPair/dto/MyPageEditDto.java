package smu.FittingPair.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyPageEditDto {
    private String userName;
    private String phoneNumber;
    private String gender;
    private Long height;

}
