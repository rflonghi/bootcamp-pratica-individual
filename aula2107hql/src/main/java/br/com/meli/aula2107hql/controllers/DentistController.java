package br.com.meli.aula2107hql.controllers;

import br.com.meli.aula2107hql.dtos.DateRequestDTO;
import br.com.meli.aula2107hql.models.Dentist;
import br.com.meli.aula2107hql.services.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/dentist")
public class DentistController {

    @Autowired
    DentistService dentistService;

    @PostMapping("/get-more-then-two-turns")
    public ResponseEntity<List<Dentist>> getDentistsWithMoreThenTwoTurns(@Valid @RequestBody DateRequestDTO dateRequestDTO) {
        return ResponseEntity.ok(dentistService.getDentistsWithMoreThenTwoTurns(dateRequestDTO.getDate()));
    }

}
