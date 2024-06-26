package smu.FittingPair.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import smu.FittingPair.Repository.UsersRepository;
import smu.FittingPair.error.ErrorCode;
import smu.FittingPair.error.exception.NotFoundException;
import smu.FittingPair.model.CustomUserDetails;
import smu.FittingPair.model.Role;
import smu.FittingPair.model.Users;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {
    private final UsersRepository usersRepository;
    // 스프링 시큐리티에서 사용자 정보를 가져오는 인터페이스

    public UserDetails loadUserByUserLogin(String phoneNumber){ //login 시 사용자 정보를 가져온다.
        Optional<Users> OptionalUser = usersRepository.findByPhoneNumber(phoneNumber);
        Users users = OptionalUser.orElseThrow(()-> new NotFoundException(ErrorCode.NOT_FOUND));
        return new CustomUserDetails(users);
    }
    @Override
    public UserDetails loadUserByUsername(String id){ //사용자 정보를 가져옴. (필수 구현)
        Optional<Users> OptionalUser = usersRepository.findById(Long.parseLong(id));
        Users users = OptionalUser.orElseThrow(()-> new NotFoundException(ErrorCode.NOT_FOUND));
        return new CustomUserDetails(users);
    }

}
