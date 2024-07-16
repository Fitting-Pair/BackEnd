package smu.FittingPair.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import smu.FittingPair.model.BodyType;
import smu.FittingPair.model.UserBodyType;

import java.util.List;

@Getter
@NoArgsConstructor
public class UserResultResponseDto {

    private String image_url;
    private String bodytypeName;
    private String bodyTypeFeature;
    private String bodyTypeCareful;
    private List<TopClothes> top;
    private List<ButtomClothes> buttom;

    @Builder
    public UserResultResponseDto(String image_url, String bodytypeName,
                                 String bodyTypeFeature, String bodyTypeCareful,
                                 List<TopClothes> top, List<ButtomClothes> buttom) {
        this.image_url = image_url;
        this.bodytypeName = bodytypeName;
        this.bodyTypeFeature = bodyTypeFeature;
        this.bodyTypeCareful = bodyTypeCareful;
        this.top = top;
        this.buttom = buttom;
    }

    public static UserResultResponseDto to(UserBodyType userBodyType, BodyType bodyTypeEntity,
                          List<ButtomClothes> buttomClothes, List<TopClothes> topClothes) {
        return UserResultResponseDto.builder()
                .image_url(userBodyType.getImageUrl())
                .bodytypeName(bodyTypeEntity.getBodytypeName())
                .bodyTypeCareful(bodyTypeEntity.getBodytypeCareful())
                .bodyTypeFeature(bodyTypeEntity.getBodytypeFeatures())
                .top(topClothes)
                .buttom(buttomClothes)
                .build();


    }
}
