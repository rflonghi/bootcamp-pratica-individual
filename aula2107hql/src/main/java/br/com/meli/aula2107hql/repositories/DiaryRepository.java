package br.com.meli.aula2107hql.repositories;

import br.com.meli.aula2107hql.models.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaryRepository  extends JpaRepository<Diary, Long> {

    List<Diary> findAllByDentist_Id(Long dentistId);

}

