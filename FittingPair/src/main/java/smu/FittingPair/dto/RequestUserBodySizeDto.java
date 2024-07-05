package smu.FittingPair.dto;

import lombok.Data;
import smu.FittingPair.model.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class RequestUserBodySizeDto {
    private Long chest_size;
    private Long hip_size;
    private Long shoulder_size;
    private Long waist_size;
    private Long height_size;




    public static BodyType addBodyType(String bodytypeName, String bodytypeFeatures, String bodytypeCareful) {
        return BodyType.builder()
                .bodytypeName(bodytypeName)
                .bodytypeFeatures(bodytypeFeatures)
                .bodytypeCareful(bodytypeCareful)
                .build();
    }

    public static UserBodyType addUserBodyType(Users users, BodySize bodySize, BodyType bodyType, String imageUrl) {
        return UserBodyType.builder()
                .bodySize(bodySize)
                .bodyType(bodyType)
                .created_at(LocalDateTime.now().toString())
                .users(users)
                .imageUrl(imageUrl)
                .build();
    }


    public static BodySize addBodySize(RequestUserBodySizeDto requestUserBodySizeDTO, Users users) {
        return  BodySize.builder()
                .users(users)
                .chest_size(requestUserBodySizeDTO.getChest_size())
                .shoulder_size(requestUserBodySizeDTO.getShoulder_size())
                .hip_size(requestUserBodySizeDTO.getHip_size())
                .height_size(requestUserBodySizeDTO.getHeight_size())
                .waist_size(requestUserBodySizeDTO.getWaist_size())
                .build();
    }

}
