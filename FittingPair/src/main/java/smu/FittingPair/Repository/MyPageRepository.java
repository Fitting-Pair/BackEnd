package smu.FittingPair.Repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import smu.FittingPair.DTO.UserNewResultDto;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class MyPageRepository {
    @PersistenceContext
    private EntityManager em;

    //매개변수 이름 수정 예정
    public void save(UserNewResultDto userNewResultDto){
            em.persist(userNewResultDto);
    }

    public UserNewResultDto findOne(Long id){
        return em.find(UserNewResultDto.class, id);
    }

    public List<UserNewResultDto> findAll(Long id) {
        return em.createQuery("SELECT u FROM UserNewResultDto u WHERE u.id = :id", UserNewResultDto.class)
                .setParameter("id", id)
                .getResultList();
    }
}
