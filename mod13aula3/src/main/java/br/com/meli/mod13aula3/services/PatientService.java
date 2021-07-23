package br.com.meli.mod13aula3.services;


import br.com.meli.mod13aula3.models.Patient;
import br.com.meli.mod13aula3.models.Turn;
import br.com.meli.mod13aula3.repositories.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {

    @Autowired
    TurnRepository turnRepository;

    public List<Patient> getPatientsInDay(Date date) {
        return turnRepository.findAllByDay(date).stream().map(Turn::getPatient).collect(Collectors.toList());
    }

}
