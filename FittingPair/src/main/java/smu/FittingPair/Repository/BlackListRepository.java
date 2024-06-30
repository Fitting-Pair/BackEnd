package smu.FittingPair.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.BlackList;
import smu.FittingPair.model.Users;

import java.util.Optional;

public interface BlackListRepository extends JpaRepository<BlackList,Long> {
    boolean existsByInvalidRefreshToken(String refreshToken);
    boolean existsByInvalidAccessToken(String accessToken);
}
