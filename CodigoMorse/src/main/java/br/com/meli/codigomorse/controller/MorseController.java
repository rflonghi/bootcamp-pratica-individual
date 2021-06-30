package br.com.meli.codigomorse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.meli.codigomorse.service.MorseService;

import java.util.Map;

@RestController
@RequestMapping(value = "/morse")
public class MorseController {

    @Autowired
    MorseService morseService;

    @GetMapping("/decodificar/{codigo}")
    public ResponseEntity<Map<String, Object>> decodificar(@PathVariable(value = "codigo") String codigo) {
        return ResponseEntity.ok(Map.of("Frase convertida", morseService.traduzir(codigo)));
    }
}
