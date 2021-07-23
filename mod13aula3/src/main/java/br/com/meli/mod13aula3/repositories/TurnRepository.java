package br.com.meli.mod13aula3.repositories;


import br.com.meli.mod13aula3.enums.TurnStatusEnum;
import br.com.meli.mod13aula3.models.Turn;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Repository
public interface TurnRepository  extends MongoRepository<Turn, String> {

    List<Turn> findAllByDay(@Temporal(TemporalType.DATE) Date day);

    List<Turn> findAllByTurnStatus_TurnStatusEnum(TurnStatusEnum turnStatusEnum);

    List<Turn> findAllByTurnStatus_TurnStatusEnumAndDay(TurnStatusEnum turnStatusEnum, @Temporal(TemporalType.DATE) Date day);

    List<Turn> findAllByDiary_Dentist_Id(String dentistId);
}
