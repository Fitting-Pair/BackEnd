package smu.FittingPair.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.Repository.UsersRepository;
import smu.FittingPair.config.error.ErrorCode;
import smu.FittingPair.DTO.SignUpRequestDto;
import smu.FittingPair.model.Users;

import java.util.Optional;
import java.util.OptionalInt;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UsersRepository usersRepository;

    //중복된 전화번호 검사

    @Transactional(readOnly = true)
    public boolean signUp(SignUpRequestDto signUpRequestDto) throws Exception {
        checkDuplicatePhoneNum(signUpRequestDto);
        usersRepository.save(signUpRequestDto.toEntity());
        return true; //로그인 ㅇㅋ
    }
    private boolean checkDuplicatePhoneNum(SignUpRequestDto signUpRequestDto) throws Exception {
        //만약 해당 전화번호를 가진 유저가 데베에 있으면,
        Optional<Users> users = usersRepository.findByPhoneNumber(signUpRequestDto.getPhoneNumber());
        if(users.isPresent()){
            throw new Exception();
        }

    }



}
