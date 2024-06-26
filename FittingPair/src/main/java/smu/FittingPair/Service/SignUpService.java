package smu.FittingPair.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.Repository.UsersRepository;
import smu.FittingPair.dto.UserInfoResponseDto;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.DuplicateKeyException;
import smu.FittingPair.dto.SignUpRequestDto;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.Role;
import smu.FittingPair.model.Users;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SignUpService {
    private final UsersRepository usersRepository;

    //중복된 전화번호 검사
    public boolean checkDuplicatePhoneNum(SignUpRequestDto signUpRequestDto){
        //만약 해당 전화번호를 가진 유저가 데베에 있으면,
        Optional<Users> users = usersRepository.findByPhoneNumber(signUpRequestDto.getPhoneNumber());
        if(users.isPresent()){
            throw new DuplicateKeyException(ErrorCode.DUPLICATE_KEY_ERROR);
        }
        return true;
    }
    @Transactional
    public void signUp(SignUpRequestDto signUpRequestDto){
       if(checkDuplicatePhoneNum(signUpRequestDto)){
           Users user = signUpRequestDto.toEntity();
           usersRepository.save(user);
           user.setRoles(List.of(Role.ROLE_USER));
       }
    }

    public UserInfoResponseDto getUserInfo(Long id){
        Optional<Users> OptionalUser = usersRepository.findById(id);
        Users users = OptionalUser.orElseThrow(()-> new NotFoundException(ErrorCode.NOT_FOUND));
        return UserInfoResponseDto.to(users);
    }




}
