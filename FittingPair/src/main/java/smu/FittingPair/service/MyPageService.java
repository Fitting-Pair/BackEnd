package smu.FittingPair.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.MypageResponseDto;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;
import smu.FittingPair.repository.MyPageRepository;
import smu.FittingPair.repository.UsersRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyPageService {
    private final AuthService authService;
    private final UsersRepository usersRepository;
    public MypageResponseDto getMypage(){
        Optional<Users> byId = usersRepository.findById(authService.currentUserId());
        List<String> dd = new ArrayList<>();

        return MypageResponseDto.myPageSetUploadDate(dd);

    }

}
