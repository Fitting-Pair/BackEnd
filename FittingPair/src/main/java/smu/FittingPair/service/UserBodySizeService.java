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
        BodySize bodySize = userBodySizeRequestDto.toEntity(userSize.getChestSize(), userSize.getHipSize(), userSize.getShoulderSize(), userSize.getWaistSize());
        //userBodySize에 있는 id는 유저 아이디가 아니라 유저 이미지 아이디므로, 유저 이미지에서 조회한 후, 유저의 정보를 이어준다.
        Users users = findUserByUserImgId(userBodySizeRequestDto.getUserId());
        putUserInfo(users,bodySize);
        //BodySize와 bodyType은 1대 1이다. 생성된 body type을 바탕으로 bodyType을 결정해준다.
        //앙방향 설정
        UserBodyType userBodyType = decideBodyType(userSize, users);
        userBodyType.setBodySize(bodySize);
        bodySize.setUserBodyType(userBodyType);
        //저장
        userBodyTypeRepository.save(userBodyType);
        bodySizeRepository.save(bodySize);
        //결과 생성
        return userBodyType;
    }
    private UserBodyType decideBodyType(UserBodySizeRequestDto.UserSize userBodySizeRequestDto, Users users) {
        if(users.getGender().equals("Male")){
            return userBodyTypeService.decideMaleBodyType(userBodySizeRequestDto,users);
        }else{
            return userBodyTypeService.decideFemaleBodyType(userBodySizeRequestDto,users);
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
