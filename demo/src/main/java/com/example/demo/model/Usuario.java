package com.example.demo.model;

import java.time.LocalDate;

public class Usuario {

    private String correo;
    private String contrasenia;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;

    public Usuario(String correo, String contrasenia, String nombreCompleto, LocalDate fechaNacimiento) {
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
