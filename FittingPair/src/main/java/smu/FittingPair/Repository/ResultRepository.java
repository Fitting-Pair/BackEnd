package smu.FittingPair.Repository;

import com.mysql.cj.log.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import smu.FittingPair.model.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {

}
