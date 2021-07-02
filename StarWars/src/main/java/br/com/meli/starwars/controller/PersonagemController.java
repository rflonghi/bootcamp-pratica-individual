package br.com.meli.starwars.controller;

import br.com.meli.starwars.entity.Personagem;
import br.com.meli.starwars.entity.dto.PersonagemDTO;
import br.com.meli.starwars.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/buscar")
public class PersonagemController {

    @Autowired
    PersonagemService personagemService;

    @GetMapping("/{name}")
    public ResponseEntity<List<PersonagemDTO>> findByName(@PathVariable(value = "name") String name) {
        return ResponseEntity.ok(personagemService.findByName(name));
    }
}
