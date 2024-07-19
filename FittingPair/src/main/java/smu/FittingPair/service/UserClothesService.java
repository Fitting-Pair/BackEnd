package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
//import smu.FittingPair.dto.ClothesDto;
import smu.FittingPair.repository.ClothesRepository;
import smu.FittingPair.repository.UserBodyTypeRepository;
import smu.FittingPair.repository.UsersRepository;

@Service
@RequiredArgsConstructor
public class UserClothesService {
//
//    private final ClothesRepository clothesRepository;
//    private final UsersRepository usersRepository;
//    private final UserBodyTypeRepository userBodyTypeRepository;
//
//    private final AuthService authService;

//    public void addUserClothes(ClothesDto clothesDto) {
//        Long id = authService.currentUserId();
//        Optional<Users> byId = usersRepository.findById(id);
//        System.out.println("byId :: " + byId.get().getId().getClass().getTypeName());
//        if (byId.isPresent()) {
//            Long userId = userBodyTypeRepository.findUserId(byId.get().getId());
//            System.out.println("user_id :: " + userId);
//            Optional<BodyShape> byId1 = bodyTypeRepository.findById(userId);
//            if (byId1.isPresent()) {
//                List<Clothes> clothes = new ArrayList<>();
//                List<ButtomClothes> buttomClothes = clothesDto.getBuottomClothes();
//                List<TopClothes> topClothes = clothesDto.getTopClothes();
//                for (ButtomClothes bottomClothe : buttomClothes) {
//                    clothes.add(ClothesDto.addClothes(byId.get(), byId1.get(), bottomClothe.getBrand(), bottomClothe.getClothesName(), bottomClothe.getImageUrl(), bottomClothe.getClothesCategory()));
//                }
//                for (TopClothes topClothe : topClothes) {
//                    clothes.add(ClothesDto.addClothes(byId.get(), byId1.get(), topClothe.getBrand(), topClothe.getClothesName(), topClothe.getImageUrl(), topClothe.getClothesCategory()));
//                }
//                clothesRepository.saveAll(clothes);
//            }
//        }
//    }

}
