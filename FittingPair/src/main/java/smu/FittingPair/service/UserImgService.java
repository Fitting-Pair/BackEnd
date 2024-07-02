package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.dto.UserImgResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.repository.UsersRepository;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserImgService {
    private final UsersRepository usersRepository;
    private final UserImgRepository userImgRepository;
    private final AuthService authService;
    public void addUserBodySize(RequestUserBodySizeDto requestUserBodySizeDTO) {
        Optional<Users> byId = usersRepository.findById(authService.currentUserId());
    }

    //프론트로부터 사용자 이미지를 받아옴.
    public void addUserImg(UserImgResponseDto userImgResponseDto) {
        Long id = authService.currentUserId();
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ErrorCode.USER_NOT_FOUND));
        // 유저안에서 이미지가 여러장. 리스트로.
        userImgRepository.save(UserImg.saveImg(user,userImgResponseDto.getImage_url()));
    }


}
