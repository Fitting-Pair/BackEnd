package smu.FittingPair.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import smu.FittingPair.model.UserImg;

import java.util.List;

// 마이페이지 조회 시 날짜들 출력될 DTO


@Getter
@NoArgsConstructor
public class MypageResponseDTO {
    private List<String> UploadDate;


}
