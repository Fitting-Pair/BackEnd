package smu.FittingPair.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Long> {
    Optional<Users> findByPhoneNumber(String phoneNum);
}
