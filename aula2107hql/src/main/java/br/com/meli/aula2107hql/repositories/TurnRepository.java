package br.com.meli.aula2107hql.repositories;

import br.com.meli.aula2107hql.enums.TurnStatusEnum;
import br.com.meli.aula2107hql.models.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.stereotype.Repository;

import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Repository
public interface TurnRepository  extends JpaRepository<Turn, Long> {

    List<Turn> findAllByDay(@Temporal(TemporalType.DATE) Date day);

    List<Turn> findAllByTurnStatus_TurnStatusEnum(TurnStatusEnum turnStatusEnum);

    List<Turn> findAllByTurnStatus_TurnStatusEnumAndDay(TurnStatusEnum turnStatusEnum, @Temporal(TemporalType.DATE) Date day);

    List<Turn> findAllByDiary_Dentist_Id(Long dentistId);
}
