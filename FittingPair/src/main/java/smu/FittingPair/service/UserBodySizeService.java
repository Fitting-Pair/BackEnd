package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.dto.ClothesDto;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.dto.UserImgResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.*;
import smu.FittingPair.repository.*;

import java.time.LocalDate;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
public class UserBodySizeService {

    private final UsersRepository usersRepository;
    private final UserImgRepository userImgRepository;
    private final AuthService authService;
    private final BodySizeRepository bodySizeRepository;

    private final BodyTypeRepository bodyTypeRepository;
    private final UserBodyTypeRepository userBodyTypeRepository;


    //측정 결과 오면 사용자 바디사이즈에 추가
    public void addUserBodySize(RequestUserBodySizeDto requestUserBodySizeDTO) {
        //사용자 찾고
        Users users = usersRepository.findById(authService.currentUserId()).orElseThrow(()-> new NotFoundException(ErrorCode.USER_NOT_FOUND));
        //사용자 관련 bodySize Entity 만들고
        BodySize bodySize = RequestUserBodySizeDto.addBodySize(requestUserBodySizeDTO, users);
        //사용자 바디 타입 Entity 만들고
        BodyType bodyType = RequestUserBodySizeDto.addBodyType("뚱이", "듬직", "뚱뚱");


        //체형 결정하는 코드는 아래 칸에다가


        //

        //사용자 바디사이즈에 저장
        bodySizeRepository.save(bodySize);
        bodyTypeRepository.save(bodyType);
        //AI 분석 사용자 바디 타입 저장, imageUrl -> AI 분석 이미지
        userBodyTypeRepository.save(RequestUserBodySizeDto.addUserBodyType(users, bodySize,bodyType, "1"));

    }


}
