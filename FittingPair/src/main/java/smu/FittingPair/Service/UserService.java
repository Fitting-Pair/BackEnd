package smu.FittingPair.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.DTO.RequestUserBodySizeDTO;
import smu.FittingPair.Repository.UserImgRepository;
import smu.FittingPair.Repository.UsersRepository;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UsersRepository usersRepository;
    private final UserImgRepository userImgRepository;

    public void addUserBodySize(RequestUserBodySizeDTO requestUserBodySizeDTO) {
        Optional<Users> byId = usersRepository.findById(requestUserBodySizeDTO.getUserID());
    }


    public void addUserImg(Long userId, String imgurl) {
        Optional<Users> byId = usersRepository.findById(userId);
        UserImg createdimg = UserImg.saveImg(byId.get(), imgurl);
        userImgRepository.save(createdimg);
    }

}
