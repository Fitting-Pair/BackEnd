package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.BodySize;
import smu.FittingPair.model.UserImg;

import java.util.Optional;

public interface BodySizeRepository extends JpaRepository<BodySize, Long> {
}
