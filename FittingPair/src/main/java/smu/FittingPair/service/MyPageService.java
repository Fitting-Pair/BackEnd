package smu.FittingPair.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.MypageResponseDto;
import smu.FittingPair.repository.MyPageRepository;

@Service
@RequiredArgsConstructor
public class MyPageService {
    private final AuthService authService;
    private final MyPageRepository myPageRepository;
    public MypageResponseDto getMypage(){
        myPageRepository.findById(authService.currentUserId());
        //dto에 내용추가하시고 올리시면 됨.
        return new MypageResponseDto();
    }

}
