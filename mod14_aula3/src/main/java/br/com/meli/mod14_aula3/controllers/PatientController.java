package br.com.meli.mod14_aula3.controllers;

import br.com.meli.mod14_aula3.dtos.DateRequestDTO;
import br.com.meli.mod14_aula3.models.Patient;
import br.com.meli.mod14_aula3.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/get-patients-in-day")
    public ResponseEntity<List<Patient>> getPatientsInDay(@Valid @RequestBody DateRequestDTO dateRequestDTO) {
        return ResponseEntity.ok(patientService.getPatientsInDay(dateRequestDTO.getDate()));
    }

}
