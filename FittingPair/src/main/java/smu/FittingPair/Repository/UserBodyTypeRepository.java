package smu.FittingPair.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.BodySize;
import smu.FittingPair.model.UserBodyType;

public interface UserBodyTypeRepository extends JpaRepository<UserBodyType, Long> {
}
