package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.BodyType;

import java.util.Optional;

public interface BodyTypeRepository extends JpaRepository<BodyType, Long> {


}
