package br.com.meli.mod10_pratica_obterdiploma.controller;

import br.com.meli.mod10_pratica_obterdiploma.dto.GradeDTO;
import br.com.meli.mod10_pratica_obterdiploma.dto.StudentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @PostMapping(value = "/analyzeNotes")
    public ResponseEntity<GradeDTO> analyzeNotes(@Valid @RequestBody StudentDTO studentDTO) {
        return ResponseEntity.ok(new GradeDTO(studentDTO));
    }
}
