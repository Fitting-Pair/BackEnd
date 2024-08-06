package smu.FittingPair.dto;

import lombok.*;
import org.apache.catalina.User;
import org.springframework.web.multipart.MultipartFile;

@Getter
@AllArgsConstructor
@Builder
public class UserImgResponseDto {
    private final String message = "이미지 처리가 완료되었습니다.";
    private Long imgId;
    public static UserImgResponseDto to(Long imgId){
        return UserImgResponseDto.builder().imgId(imgId).build();
    }
}