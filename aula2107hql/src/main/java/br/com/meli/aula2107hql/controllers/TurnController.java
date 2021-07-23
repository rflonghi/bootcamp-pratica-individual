package br.com.meli.aula2107hql.controllers;

import br.com.meli.aula2107hql.dtos.DateRequestDTO;
import br.com.meli.aula2107hql.models.Turn;
import br.com.meli.aula2107hql.services.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/turn")
public class TurnController {

    @Autowired
    TurnService turnService;

    @GetMapping("/get-all-finished")
    public ResponseEntity<List<Turn>> getAllFinished() {
        return ResponseEntity.ok(turnService.getAllFinished());
    }

    @PostMapping("/get-all-pendent-by-day")
    public ResponseEntity<List<Turn>> getAllPendentByDay(@Valid @RequestBody DateRequestDTO dateRequestDTO) {
        return ResponseEntity.ok(turnService.getAllPendentByDay(dateRequestDTO.getDate()));
    }

    @GetMapping("/get-all-rescheduled")
    public ResponseEntity<List<Turn>> getAllRescheduled() {
        return ResponseEntity.ok(turnService.getAllRescheduled());
    }

    @GetMapping("/get-all-rescheduled-by-dentist/{dentistId}")
    public ResponseEntity<List<Turn>> getAllRescheduledByDentistId(@PathVariable(value = "dentistId") Long dentistId) {
        return ResponseEntity.ok(turnService.getAllRescheduledByDentist(dentistId));
    }

}
