package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ReporteDTO(
        @NotBlank(message="El campo es requerido")
        @Size(min=8,max=8,message = "El tamaño del id del reporte no puede superar los 8 caracteres")
        String ID) {
}
