package smu.FittingPair.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> 184eab97446d299801b90f8a6efb8996b133b7fe
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyPageEditDto {
    private String userName;
<<<<<<< HEAD
=======
    private String phoneNumber;
    private String gender;
>>>>>>> 184eab97446d299801b90f8a6efb8996b133b7fe
    private Long height;

}
