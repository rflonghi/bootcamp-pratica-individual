package br.com.meli.mod14_aula3.repositories;

import br.com.meli.mod14_aula3.models.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DiaryRepository  extends MongoRepository<Diary, String> {

    List<Diary> findAllByDentist_Id(String dentistId);

}

