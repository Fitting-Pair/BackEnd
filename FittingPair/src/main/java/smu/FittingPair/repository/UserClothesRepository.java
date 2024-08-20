package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.UserClothes;

public interface UserClothesRepository extends JpaRepository<UserClothes,Long> {
}
