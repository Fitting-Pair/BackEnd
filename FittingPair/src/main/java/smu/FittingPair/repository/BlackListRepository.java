package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.BlackList;

public interface BlackListRepository extends JpaRepository<BlackList,Long> {
    boolean existsByInvalidRefreshToken(String refreshToken);
    boolean existsByInvalidAccessToken(String accessToken);
}
