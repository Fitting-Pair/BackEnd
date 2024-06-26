package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//mypage 저장을 위해 post로 들어오는 DTO


@Data @NoArgsConstructor
public class UserNewResultDTO {

    private Long userID;
    private String uploadDate;
    private String bodytypeFeatures;
    private String bodytypeCareful;
    private String imgUrl;
    private List<ClothesDTO> outwear;
    private List<ClothesDTO> top;
    private List<ClothesDTO> bottom;

    @Builder
    public UserNewResultDTO(String uploadDate, String bodytypeFeatures, String bodytypeCareful, String imgUrl, List<ClothesDTO> clothesDTOList) {
        this.uploadDate = uploadDate;
        this.bodytypeFeatures = bodytypeFeatures;
        this.bodytypeCareful = bodytypeCareful;
        this.imgUrl = imgUrl;
        this.outwear = clothesDTOList;
        this.top = clothesDTOList;
        this.bottom = clothesDTOList;
    }
}
