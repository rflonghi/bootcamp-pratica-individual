package br.com.meli.mod6aula1_ativcomp.exception;

import br.com.meli.mod6aula1_ativcomp.dto.ErrorDTO;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProdutoControllerExceptionHandler {

    @ExceptionHandler({ProductNotFoundException.class})
    public ResponseEntity<ErrorDTO> ProductNotFoundException(ProductNotFoundException exception) {
        ErrorDTO error = new ErrorDTO();
        error.setName("Product not found exception.");
        error.setMessage(exception.getMessage());
        error.setStatusCode(400);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
