package br.com.meli.aula2107hql.controllers;

import br.com.meli.aula2107hql.models.Diary;
import br.com.meli.aula2107hql.services.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diary")
public class DiaryController {

    @Autowired
    DiaryService diaryService;

    @GetMapping("/get-all-by-dentist/{dentistId}")
    public ResponseEntity<List<Diary>> getDentistDiarysByDentistId(@PathVariable(value = "dentistId") Long dentistId) {
        return ResponseEntity.ok(diaryService.getDentistDiarysByDentistId(dentistId));
    }

}
