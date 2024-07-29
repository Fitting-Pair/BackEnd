package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smu.FittingPair.model.MyPage;
import smu.FittingPair.model.UserImg;

@Repository
public interface  MyPageRepository extends JpaRepository<MyPage, Long> {



}
