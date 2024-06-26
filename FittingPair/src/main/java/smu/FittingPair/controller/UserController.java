package smu.FittingPair.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.dto.RequestUserBodySizeDTO;
import smu.FittingPair.Service.UserService;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/body/bodytype")
    public void addUserBodyType(@RequestBody RequestUserBodySizeDTO requestUserBodySizeDTO) {
        userService.addUserBodySize(requestUserBodySizeDTO);
    }


}
