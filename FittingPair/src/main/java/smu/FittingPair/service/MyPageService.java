package smu.FittingPair.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;
import smu.FittingPair.repository.UserBodyTypeRepository;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.repository.UsersRepository;

import java.util.*;

@Service
@RequiredArgsConstructor
public class MyPageService {
    private final AuthService authService;
    private final UserBodyTypeRepository userBodyTypeRepository;
    private final UserImgRepository userImgRepository;

    public List<String> getMypage(){
        return userImgRepository.findCreateAt(authService.currentUserId());
    }

}
