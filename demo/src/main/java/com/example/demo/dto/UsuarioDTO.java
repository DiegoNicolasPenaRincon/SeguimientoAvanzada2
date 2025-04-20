package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record UsuarioDTO(
        @NotBlank(message = "El campo es requerido")
        @Email(message = "Debe ser un email válido")
        String correo,
        @NotBlank(message = "El campo es requerido")
        //@Pattern(regexp = "^(?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z]).*$",message = "Debe contener a")
        @Size(min = 8,message = "La longitud mínima es 8")
        String contrasenia,
        @NotBlank(message = "El campo es requerido")
        @Size(max = 100,message = "No debe exceder los 100 caracteres")
        String nombreCompleto,
        @NotNull(message = "La fecha no puede ser nula")
        @PastOrPresent(message = "La fecha no puede ser futura")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        LocalDate fechaNacimiento) {
}
