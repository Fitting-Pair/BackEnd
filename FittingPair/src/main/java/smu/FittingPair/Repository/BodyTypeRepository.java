package smu.FittingPair.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.BodySize;
import smu.FittingPair.model.BodyType;

public interface BodyTypeRepository extends JpaRepository<BodyType, Long> {
}
