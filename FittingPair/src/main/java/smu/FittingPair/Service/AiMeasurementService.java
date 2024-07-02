package smu.FittingPair.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.Repository.*;
import smu.FittingPair.dto.AiBodySizeRequestDto;
import smu.FittingPair.dto.BodyTypeDto;
import smu.FittingPair.dto.ClothesDto;
import smu.FittingPair.dto.UserNewResultRequestDto;
import smu.FittingPair.model.*;

import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AiMeasurementService {
    private final UsersRepository usersRepository;
    private final ResultRepository resultRepository;
    private final BodySizeRepository bodySizeRepository;
    private final BodyTypeRepository bodyTypeRepository;
    private final ClothesRepository clothesRepository;
    private final UserBodyTypeRepository userBodyTypeRepository;

    //                UserBodyType.
//                        Result.
//                        resultRepository.save()
    public void AiMeasurement(String userId, AiBodySizeRequestDto aiBodySizeRequestDto) {
        Optional<Users> byId = usersRepository.findById(Long.parseLong(userId));
        if (byId.isPresent()) {
            Users users = byId.get();
            BodySize bodySize = addBodySize(users, aiBodySizeRequestDto);
            addUserBodyType(users, bodySize);
            addBodyType();
            addClothes();
        }
    }

    private BodySize addBodySize(Users byId, AiBodySizeRequestDto aiBodySizeRequestDto) {
        BodySize build = BodySize.builder()
                .users(byId)
                .waist_size(aiBodySizeRequestDto.getWaist_size())
                .height_size(aiBodySizeRequestDto.getHeight_size())
                .hip_size(aiBodySizeRequestDto.getHip_size())
                .shoulder_size(aiBodySizeRequestDto.getShoulder_size())
                .chest_size(aiBodySizeRequestDto.getChest_size())
                .build();
        bodySizeRepository.save(build);
        return build;
    }

    private BodyType addBodyType(BodyTypeDto bodyTypeDto) {
        BodyType build = BodyType.builder()
                .bodytypeCareful(bodyTypeDto.getBodytypeCareful())
                .bodytypeFeatures(bodyTypeDto.getBodytypeFeatures())
                .bodytypeName(bodyTypeDto.getBodytypeName())
                .build();
        bodyTypeRepository.save(build);
    }
    private void addClothes(UserNewResultRequestDto userNewResultRequestDto, Users users) {

        for (ClothesDto clothesDto : userNewResultRequestDto.getOutwear()) {
            Clothes.builder()
                    .clothesName(clothesDto.getClothesName())
                    .brand(clothesDto.getClothesBrand())
                    .bodyType()
                    .users(users)
                    .build();

        }
        
    }
    private void addUserBodyType(Users byId, BodySize bodySize, BodyType bodyType, String imageUrl) {
        UserBodyType.builder()
                .users(byId)
                .bodySize(bodySize)
                .imageUrl(imageUrl)
                .created_at(String.valueOf(LocalDate.now()))
                .bodyType(bodyType)
                .build();
    }
}
