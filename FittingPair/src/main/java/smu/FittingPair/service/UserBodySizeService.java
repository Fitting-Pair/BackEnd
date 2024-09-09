package smu.FittingPair.service;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import smu.FittingPair.dto.UserBodySizeRequestDto;
import smu.FittingPair.dto.UserObjRequestDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.BodySize;
import smu.FittingPair.model.UserBodyType;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;
import smu.FittingPair.repository.BodySizeRepository;
import smu.FittingPair.repository.UserBodyTypeRepository;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.repository.UsersRepository;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;




@RequiredArgsConstructor
@Service
public class UserBodySizeService {
    private final UsersRepository usersRepository;
    private final BodySizeRepository bodySizeRepository;
    private final UserImgRepository userImgRepository;
    private final UserBodyTypeService userBodyTypeService;
    private final UserBodyTypeRepository userBodyTypeRepository;
    private final UserResultService userResultService;

    //json으로부터 받은 결과를 주입하고, 새로운 BodySize 객체를 만들어 UserImg와 이어준다.
    @Transactional
    public UserBodyType putBodySize(UserBodySizeRequestDto userBodySizeRequestDto){
        UserBodySizeRequestDto.UserSize userSize = userBodySizeRequestDto.getUserSize();
        Users users = findUserByUserImgId(userBodySizeRequestDto.getUserId());
        BodySize bodySize = setBodySizeByGender(userBodySizeRequestDto, userSize, users);
        putUserInfo(users,bodySize);

        UserBodyType userBodyType = decideBodyType(bodySize, users);
        userBodyType.setBodySize(bodySize);
        bodySize.setUserBodyType(userBodyType);
        //저장
        userBodyTypeRepository.save(userBodyType);
        bodySizeRepository.save(bodySize);
        //결과 생성
        return userBodyType;
    }

    private static BodySize setBodySizeByGender(UserBodySizeRequestDto userBodySizeRequestDto, UserBodySizeRequestDto.UserSize userSize, Users users) {
        BodySize bodySize;
        if(users.getGender().equals("male")){
            bodySize = userBodySizeRequestDto.toEntity(userSize.getChestSize(), userSize.getHipSize(), userSize.getShoulderSize()+13, userSize.getWaistSize()+7);
        }
        else{
            bodySize = userBodySizeRequestDto.toEntity(userSize.getChestSize(), userSize.getHipSize(), userSize.getShoulderSize(), userSize.getWaistSize());
        }
        return bodySize;
    }

    private UserBodyType decideBodyType(BodySize bodySize, Users users) {
        System.out.println("Chest Size: " + bodySize.getChestSize());
        System.out.println("Hip Size: " + bodySize.getHipSize());
        System.out.println("Shoulder Size: " + bodySize.getShoulderSize()); // +13 적용된 값이 나오는지 확인
        System.out.println("Waist Size: " + bodySize.getWaistSize());
        if(users.getGender().equals("male")){
            return userBodyTypeService.decideMaleBodyType(bodySize.getChestSize(),bodySize.getHipSize(),bodySize.getShoulderSize(),bodySize.getWaistSize(),users);
        }else{
            return userBodyTypeService.decideFemaleBodyType(bodySize.getChestSize(),bodySize.getHipSize(),bodySize.getShoulderSize(),bodySize.getWaistSize(),users);
        }
    }
    public Users findUserByUserImgId(Long id){
        UserImg userImg = userImgRepository.findById(id).orElseThrow(()->new NotFoundException(ErrorCode.USER_IMG_NOT_FOUND));
        return userImg.getUsers();
    }
    public void putUserInfo(Users users,BodySize bodySize){
        //키를 주입
        bodySize.setHeightSize(users.getHeight());
        //이미지를 주입
        bodySize.setUserImg(userImgRepository.findFile(users.getId()));
    }


}
