package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import smu.FittingPair.model.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Long> {
    Optional<Users> findByPhoneNumber(String phoneNum);

    Boolean existsByPhoneNumber(String phoneNumber);
}
