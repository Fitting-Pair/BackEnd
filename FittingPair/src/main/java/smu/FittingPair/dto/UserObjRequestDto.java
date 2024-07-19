package smu.FittingPair.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@Getter @Setter
public class UserObjRequestDto {
    Long id; //userImgId
    MultipartFile multipartFile; //obj file

    public UserObjRequestDto(Long id,MultipartFile multipartFile){
        this.id = id;
        this.multipartFile = multipartFile;
    }

}
