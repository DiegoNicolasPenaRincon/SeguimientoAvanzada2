package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Usuario {

    private String correo;
    private String contrasenia;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;


}
