package com.example.demo.dto;

import exceptions.UsuarioNoRegistradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// DTO que representa las respuestas de Error
public record ErroresDTO(String tipo, String mensaje) {

}
@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(UsuarioNoRegistradoException.class)
    public ResponseEntity<ErroresDTO> handleValueConflictException
            (UsuarioNoRegistradoException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(
                new ErroresDTO("ERROR",ex.getMessage()));
    }
}
