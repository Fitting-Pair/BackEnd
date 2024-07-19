package smu.FittingPair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import smu.FittingPair.model.UserImg;

import java.util.List;

@Repository
public interface UserImgRepository extends JpaRepository<UserImg, Long> {


    @Query("SELECT U FROM UserImg U WHERE U.users.id = :userId ORDER BY U.createdAt DESC LIMIT 1")
    UserImg findFile(@Param("userId") Long userId);

    @Query("SELECT U FROM UserImg U WHERE U.users.id = :userId AND U.createdAt = :savetime")
    UserImg deleteFindFile(@Param("userId") Long userId, @Param("savetime") String savetime);

    @Query("SELECT U.createdAt from UserImg U where U.users.id = :userId ORDER BY U.createdAt desc ")
    List<String> findCreateAt(@Param("userId") Long userId);

    @Query("SELECT U FROM UserImg U WHERE U.users.id = :userId AND U.createdAt = :saveImgTime")
    UserImg findImg(@Param("userId") Long userId, @Param("saveImgTime") String saveImgTime);


}

