package smu.FittingPair;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import smu.FittingPair.dto.UserBodySizeRequestDto;
import smu.FittingPair.model.*;
import smu.FittingPair.repository.UserBodyTypeRepository;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.service.AuthService;
import smu.FittingPair.service.UserBodyTypeService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class FittingPairApplicationTests {

	@Mock
	private UserBodyTypeRepository userBodyTypeRepository;

	@Mock
	private UserImgRepository userImgRepository;

	@Mock
	private AuthService authService;

	@InjectMocks
	private UserBodyTypeService userBodyTypeService;

	@Test
	public void testDecideMaleBodyType() {
		// Given: 가상의 사용자 신체 치수 생성 (남성)
		UserBodySizeRequestDto.UserSize userSize = new UserBodySizeRequestDto.UserSize(
				77.06681796308152,   // 가슴
				90.16347281861906,   // 힙
				45.16877579689026,   // 어깨
				67.89501298986005    // 허리
		);
		Users maleUser = Users.builder().gender("male").build();
	}
}

