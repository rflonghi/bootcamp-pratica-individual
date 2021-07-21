package br.com.meli.aula2107hql.services;

import br.com.meli.aula2107hql.models.Dentist;
import br.com.meli.aula2107hql.repositories.DentistRepository;
import br.com.meli.aula2107hql.repositories.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class DentistService {

    @Autowired
    DentistRepository dentistRepository;

    @Autowired
    TurnRepository turnRepository;

    public List<Dentist> getDentistsWithMoreThenTwoTurns(Date date) {
        List<Long> dentistsIds = turnRepository.findAllByDay(date).stream().map(e -> e.getDiary().getDentist().getId())
                .collect(Collectors.toList());

        dentistsIds.removeIf(id -> dentistsIds.stream().filter(e -> e.equals(id)).count() < 3);
        return dentistsIds.stream().map(e -> dentistRepository.findById(e)).map(e -> e.orElse(null)).filter(Objects::nonNull)
                .collect(Collectors.toList());
    }


}
