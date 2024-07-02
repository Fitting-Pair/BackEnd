package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.dto.RequestUserBodySizeDto;
import smu.FittingPair.service.UserImgService;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserImgService userImgService;

    @PostMapping("/body/bodytype")
    public void addUserBodyType(@RequestBody RequestUserBodySizeDto requestUserBodySizeDTO) {
        userImgService.addUserBodySize(requestUserBodySizeDTO);
    }

}
