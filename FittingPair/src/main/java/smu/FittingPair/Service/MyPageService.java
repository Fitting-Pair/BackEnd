package smu.FittingPair.Service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.DTO.MypageResponseDTO;
import smu.FittingPair.Repository.UsersRepository;
import smu.FittingPair.model.Users;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyPageService {
    private final UsersRepository usersRepository;


    //이미지를 넣고 해야함
//    public MypageResponseDTO getmypage (Long id){
//        Optional<Users> byId = usersRepository.findById(id);
//
//
//        return  넣어야 함;
//    }

}
