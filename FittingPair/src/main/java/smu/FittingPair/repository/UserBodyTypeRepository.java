package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import smu.FittingPair.model.UserBodyType;
import smu.FittingPair.model.Users;


public interface UserBodyTypeRepository extends JpaRepository<UserBodyType, Long> {


    @Query("SELECT U.users.id FROM UserBodyType U WHERE U.users.id = :userId")
    Long findUserId(@Param("userId") Long userId);
}
