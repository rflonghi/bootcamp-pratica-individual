package br.com.meli.mod6aula1_ativcomp.controller;

import br.com.meli.mod6aula1_ativcomp.dto.ProdutoDTO;
import br.com.meli.mod6aula1_ativcomp.model.Produto;
import br.com.meli.mod6aula1_ativcomp.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/product")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping(value = "/create")
    public ResponseEntity<ProdutoDTO> create(@Valid @RequestBody ProdutoDTO produtoDTO) {
        return ResponseEntity.ok(produtoService.save(produtoDTO));
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<ProdutoDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.findProductById(id));
    }

    @PatchMapping(value = "/update/{id}")
    public ResponseEntity<ProdutoDTO> updateProduct(@PathVariable Long id, @RequestBody ProdutoDTO produtoDTO) {
        return ResponseEntity.ok(produtoService.update(id, produtoDTO));
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable Long id) {
        produtoService.deleteProduct(id);
        return ResponseEntity.status(200).build();
    }
}
