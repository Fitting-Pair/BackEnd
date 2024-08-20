package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.BottomClothesItems;
import smu.FittingPair.model.UserClothes;

public interface BottomClothesItemRepository extends JpaRepository<BottomClothesItems,Long> {
}
