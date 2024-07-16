package smu.FittingPair.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.model.BodySize;
import smu.FittingPair.model.BodyType;
import smu.FittingPair.model.UserBodyType;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.repository.BodySizeRepository;
import smu.FittingPair.repository.UserBodyTypeRepository;
import smu.FittingPair.repository.UserImgRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserBodyTypeService {

    private final UserBodyTypeRepository userBodyTypeRepository;
    private final UserImgRepository userImgRepository;
    private final AuthService authService;


    @Transactional
    public void addUserBodySize(RequestUserBodySizeDto requestUserBodySizeDTO) {
        Long userId = authService.currentUserId();
        //제일 최신순 이미지 파일을 가져옴
        UserImg findfile = userImgRepository.findfile(userId);

        System.out.println("find file Date Time :: " + findfile.getCreated_at());
        BodySize bodySize = BodySize.builder()
                .waist_size(requestUserBodySizeDTO.getWaist_size())
                .height_size(requestUserBodySizeDTO.getHeight_size())
                .shoulder_size(requestUserBodySizeDTO.getShoulder_size())
                .chest_size(requestUserBodySizeDTO.getChest_size())
                .userImg(findfile)
                .build();



        UserBodyType userBodyType = UserBodyType.builder()
                .users(findfile.getUsers())
                .created_at(LocalDateTime.now().toString())
                .imageUrl("ddd")
                .build();

        bodySize.setttingUserBodyType(userBodyType);

        BodyType bodyType = BodyType.builder()
                .bodytypeName("뚱이체형")
                .bodytypeFeatures("듬직")
                .bodytypeCareful("꼴보기 싫음")
                .build();

        bodyType.settingUserBodyType(userBodyType);

        userBodyType.settingA(bodyType, bodySize);


        userBodyTypeRepository.save(userBodyType);


    }










}
