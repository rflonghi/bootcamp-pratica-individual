package br.com.meli.mod6aula1_ativcomp.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(Long id) {
        super("Product " + id + " not found.");
    }
}
