package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.repository.UsersRepository;
import smu.FittingPair.dto.UserImgDto;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UsersRepository usersRepository;
    private final UserImgRepository userImgRepository;

    public void addUserBodySize(RequestUserBodySizeDto requestUserBodySizeDTO) {
        Optional<Users> byId = usersRepository.findById(requestUserBodySizeDTO.getUserID());
    }




    public void addUserImg(String userId, UserImgDto userImgDto) {
        Optional<Users> byId = usersRepository.findById(Long.parseLong(userId));
        if (byId.isPresent()) {
            UserImg build = UserImg.builder().
                    image_url(userImgDto.getImage_url())
                    .users(byId.get())
                    .build();
            userImgRepository.save(build);
        } else {
            System.out.println("조회된 사용자가 없음");
        }

    }


//    public void addUserImg(Long userId, String imgurl) {
//        Optional<Users> byId = usersRepository.findById(userId);
//        UserImg createdimg = UserImg.saveImg(byId.get(), imgurl);
//        userImgRepository.save(createdimg);
//    }



}
