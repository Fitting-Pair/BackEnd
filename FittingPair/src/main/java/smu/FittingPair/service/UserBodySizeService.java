package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.dto.UserImgResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.BodySize;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;
import smu.FittingPair.repository.BodySizeRepository;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.repository.UsersRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
public class UserBodySizeService {
    private final UsersRepository usersRepository;
    private final UserImgRepository userImgRepository;
    private final AuthService authService;
    private final BodySizeRepository bodySizeRepository;
    //측정 결과 오면 사용자 바디사이즈에 추가
    public void addUserBodySize(RequestUserBodySizeDto requestUserBodySizeDTO) {
        //사용자 찾고
        Users users = usersRepository.findById(authService.currentUserId()).orElseThrow(()-> new NotFoundException(ErrorCode.USER_NOT_FOUND));
        BodySize bodySize = new BodySize(users, requestUserBodySizeDTO.getChest_size(), requestUserBodySizeDTO.getHip_size(), requestUserBodySizeDTO.getHip_size(), requestUserBodySizeDTO.getWaist_size(),requestUserBodySizeDTO.getHeight_size());
        //사용자 바디사이즈에 저장
        bodySizeRepository.save(bodySize);

    }


}
