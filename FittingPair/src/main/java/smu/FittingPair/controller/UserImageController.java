package smu.FittingPair.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import smu.FittingPair.Repository.UsersRepository;
import smu.FittingPair.Service.UserService;

@RestController
@RequiredArgsConstructor
public class UserImageController {
    private final UserService userService;



    @PostMapping("/usersimg/upload/{id}")
    public void addUserImg(@PathVariable Long id, @RequestBody String imageurl) {
        userService.addUserImg(id, imageurl);
    }
}
