package smu.FittingPair.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import smu.FittingPair.dto.ClothesDto;

import java.util.List;

@Getter
@Builder
@RequiredArgsConstructor
public class UserNewResult {

//
    @Id
    private Long id;

    private Long userID;
    private String bodytypeFeatures;
    private String bodytypeCareful;
    private String imgUrl;
//    private List<ClothesItem> outwear;
//    private List<ClothesItem> top;
//    private List<ClothesItem> bottom;


}
