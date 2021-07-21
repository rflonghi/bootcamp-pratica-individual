package br.com.meli.aula2107hql.services;

import br.com.meli.aula2107hql.enums.TurnStatusEnum;
import br.com.meli.aula2107hql.models.Turn;
import br.com.meli.aula2107hql.repositories.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TurnService {

    @Autowired
    TurnRepository turnRepository;

    public List<Turn> getAllFinished() {
        return turnRepository.findAllByTurnStatus_TurnStatusEnum(TurnStatusEnum.CONCLUIDO);
    }

    public List<Turn> getAllPendentByDay(Date date) {
        return turnRepository.findAllByTurnStatus_TurnStatusEnumAndDay(TurnStatusEnum.CONCLUIDO, date);
    }

    public List<Turn> getAllRescheduledByDentist(Long dentistId) {
        return turnRepository.findAllByDiary_Dentist_Id(dentistId).stream().filter(e -> e.getOldTurn() != null).collect(Collectors.toList());
    }

    public List<Turn> getAllRescheduled() {
        return turnRepository.findAll().stream().filter(e -> e.getOldTurn() != null).collect(Collectors.toList());
    }

}
