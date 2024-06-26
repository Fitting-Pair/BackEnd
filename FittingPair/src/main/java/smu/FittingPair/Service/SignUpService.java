package smu.FittingPair.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.DTO.SignUpRequestDTO;
import smu.FittingPair.Repository.UsersRepository;
import smu.FittingPair.DTO.UserInfoResponseDTO;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.DuplicateKeyException;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.MyPage;
import smu.FittingPair.model.Users;
import smu.FittingPair.utill.mapToEntity;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SignUpService {
    private final UsersRepository usersRepository;

    //중복된 전화번호 검사
    public boolean checkDuplicatePhoneNum(SignUpRequestDTO signUpRequestDto){
        //만약 해당 전화번호를 가진 유저가 데베에 있으면,
        Optional<Users> users = usersRepository.findByPhoneNumber(signUpRequestDto.getPhoneNumber());
        if(users.isPresent()){
            throw new DuplicateKeyException(ErrorCode.DUPLICATE_KEY_ERROR);
        }
        return true;
    }

    @Transactional
    public void signUp(SignUpRequestDTO signUpRequestDto){
        if(checkDuplicatePhoneNum(signUpRequestDto)){
            Users users = mapToEntity.mapToUsersEntity(signUpRequestDto);
            MyPage myPage = mapToEntity.myPageSetUsers(users);
            users.setUsers(myPage);
           usersRepository.save(users);
       }
    }

    public UserInfoResponseDTO getUserInfo(Long id){
        Optional<Users> OptionalUser = usersRepository.findById(id);
        Users users = OptionalUser.orElseThrow(()-> new NotFoundException(ErrorCode.NOT_FOUND));
        return UserInfoResponseDTO.to(users);
    }




}
