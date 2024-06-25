package smu.FittingPair.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import smu.FittingPair.Repository.UsersRepository;
@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {
    private final UsersRepository usersRepository;
    // 스프링 시큐리티에서 사용자 정보를 가져오는 인터페이스
    @Override
    public UserDetails loadUserByUsername(String phoneNumber){ //사용자 정보를 가져옴. (필수 구현)
        return usersRepository.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new IllegalArgumentException(phoneNumber));
    }
}
