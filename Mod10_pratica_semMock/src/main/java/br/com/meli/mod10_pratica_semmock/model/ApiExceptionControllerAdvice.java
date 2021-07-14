package br.com.meli.mod10_pratica_semmock.model;

import br.com.meli.mod10_pratica_semmock.dto.ValidationError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ApiExceptionControllerAdvice {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ValidationError> handlerMethodArgumentNotValid(MethodArgumentNotValidException exception) {
        ValidationError error = new ValidationError();
        error.setName("Method not valid exception.");
        List<String> listFields = exception.getFieldErrors().stream().map(FieldError::getField).collect(Collectors.toList());
        error.setErrorDetail("Invalid Fields: " + listFields.toString());
        error.setHtttpStatusCode(400);
        return new ResponseEntity<ValidationError>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({HttpMessageNotReadableException.class})
    public ResponseEntity<ValidationError> httpMessageNotReadableException(HttpMessageNotReadableException exception) {
        ValidationError error = new ValidationError();
        error.setName("Http Message Not Readable Exception.");
        error.setErrorDetail("Filds can not be null.");
        error.setHtttpStatusCode(400);
        return new ResponseEntity<ValidationError>(error, HttpStatus.BAD_REQUEST);
    }
}
