package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//mypage 저장을 위해 post로 들어오는 DTO


@Data @NoArgsConstructor
public class UserNewResultDto {

    private Long userID;
    private String uploadDate;
    private String bodytypeFeatures;
    private String bodytypeCareful;
    private String imgUrl;
    private List<ClothesDto> outwear;
    private List<ClothesDto> top;
    private List<ClothesDto> bottom;

    @Builder
    public UserNewResultDto(String uploadDate, String bodytypeFeatures, String bodytypeCareful, String imgUrl, List<ClothesDto> clothesDtoList) {
        this.uploadDate = uploadDate;
        this.bodytypeFeatures = bodytypeFeatures;
        this.bodytypeCareful = bodytypeCareful;
        this.imgUrl = imgUrl;
        this.outwear = clothesDtoList;
        this.top = clothesDtoList;
        this.bottom = clothesDtoList;
    }
}
