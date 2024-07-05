package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//mypage 저장을 위해 post로 들어오는 DTO


@Data @NoArgsConstructor
public class UserNewResultRequestDto {

    private Long userID;
    private String bodytypeFeatures;
    private String bodytypeCareful;
    //사용자 결과 이미지
    private String imgUrl;
    private List<ClothesDto> top;
    private List<ClothesDto> bottom;

    @Builder
    public UserNewResultRequestDto(String bodytypeFeatures, String bodytypeCareful, String imgUrl, List<ClothesDto> clothesDtoList) {
        this.bodytypeFeatures = bodytypeFeatures;
        this.bodytypeCareful = bodytypeCareful;
        this.imgUrl = imgUrl;
        this.top = clothesDtoList;
        this.bottom = clothesDtoList;
    }
}
