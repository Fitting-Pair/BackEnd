package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.Clothes;

public interface ClothesRepository extends JpaRepository<Clothes, Long> {
}
