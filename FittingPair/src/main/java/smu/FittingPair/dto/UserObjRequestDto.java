package smu.FittingPair.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@Getter @Setter
@Builder
@NoArgsConstructor
public class UserObjRequestDto {
    Long id; //userImgId
    MultipartFile multipartFile; //userImg

    public static UserObjRequestDto to(Long id, MultipartFile multipartFile){
       return UserObjRequestDto.builder().id(id).multipartFile(multipartFile).build();
    }

}
