package br.com.meli.obterdiploma.controller;

import br.com.meli.obterdiploma.model.dto.AlunoDTO;
import br.com.meli.obterdiploma.model.dto.DiplomaDTO;
import br.com.meli.obterdiploma.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping("/resultado")
    public ResponseEntity<DiplomaDTO> postResultado(@RequestBody AlunoDTO alunoDTO) {
        return ResponseEntity.ok(alunoService.obterDiploma(alunoDTO));
    }

}
