package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.Result;
import smu.FittingPair.model.UserImg;
import smu.FittingPair.model.Users;

import java.util.Optional;

public interface ResultRepository extends JpaRepository<Result, Long> {
    Optional<Result> findByUserImg(UserImg userImg);

}
