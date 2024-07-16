package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import smu.FittingPair.dto.ButtomClothes;
import smu.FittingPair.dto.TopClothes;
import smu.FittingPair.model.Clothes;

import java.util.List;

public interface ClothesRepository extends JpaRepository<Clothes, Long> {

    @Query("select new smu.FittingPair.dto.ButtomClothes(C.imageUrl, C.clothesName, C.brand) from Clothes C where C.users.id = :user_id and C.clothesCategory = :category_type")
    List<ButtomClothes> findButtomClothes(@Param("user_id") Long user_id, @Param("category_type") String category_type);

    @Query("select new smu.FittingPair.dto.TopClothes(T.imageUrl, T.clothesName, T.brand) from Clothes T where T.users.id = :user_id and T.clothesCategory = :category_type")
    List<TopClothes> findTopClothes(@Param("user_id") Long user_id, @Param("category_type") String category_type);


    @Query("SELECT C FROM Clothes C where C.users.id = :user_id AND C.bodyType.id = :bodytype_id")
    List<Clothes> deleterepo(@Param("user_id") Long user_id, @Param("bodytype_id") Long bodytype_id);

}
