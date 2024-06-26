package smu.FittingPair.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

// 마이페이지 조회 시 날짜들 출력될 DTO


@Getter
@NoArgsConstructor
public class MypageResponseDto {
    private List<String> UploadDate;


}
