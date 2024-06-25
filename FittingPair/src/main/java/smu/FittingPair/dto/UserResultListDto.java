package smu.FittingPair.DTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//마이페이지 조회 시 출력될 결과 날짜들

@Data
@NoArgsConstructor
public class UserResultListDto {
    private List<String> LocalDateTime;  // 나중에 타입 바꿔야함
}
