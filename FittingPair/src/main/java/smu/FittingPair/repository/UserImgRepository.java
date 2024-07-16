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


    @Query("SELECT U FROM UserImg U WHERE U.users.id = :userId ORDER BY U.created_at DESC LIMIT 1")
    UserImg findfile(@Param("userId") Long userId);

    @Query("SELECT U FROM UserImg U WHERE U.users.id = :userId AND U.created_at = :savetime")
    UserImg deletefindfile(@Param("userId") Long userId, @Param("savetime") String savetime);

    @Query("SELECT U.created_at from UserImg U where U.users.id = :userId ORDER BY U.created_at desc ")
    List<String> findCreate_At(@Param("userId") Long userId);

    @Query("SELECT U FROM UserImg U WHERE U.users.id = :userId AND U.created_at = :saveImgTime")
    UserImg findImg(@Param("userId") Long userId, @Param("saveImgTime") String saveImgTime);




}

