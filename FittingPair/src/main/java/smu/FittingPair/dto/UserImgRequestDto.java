package smu.FittingPair.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
@RequiredArgsConstructor
public class UserImgRequestDto {
    //private String image_url;
    private MultipartFile imageFile;
}