package br.com.meli.aula2107hql.services;

import br.com.meli.aula2107hql.models.Patient;
import br.com.meli.aula2107hql.models.Turn;
import br.com.meli.aula2107hql.repositories.PatientRepository;
import br.com.meli.aula2107hql.repositories.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    TurnRepository turnRepository;

    public List<Patient> getPatientsInDay(Date date) {
        return turnRepository.findAllByDay(date).stream().map(Turn::getPatient).collect(Collectors.toList());
    }

}
