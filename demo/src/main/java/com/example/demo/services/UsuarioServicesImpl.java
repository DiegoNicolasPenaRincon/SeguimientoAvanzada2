package com.example.demo.services;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.model.Usuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UsuarioServicesImpl implements UsuarioServices {

    @Override
    public Usuario crearUsuario(UsuarioDTO usuarioDTO) {
        //Recordad corregir esto
        return Usuario.builder().correo(usuarioDTO.correo()).nombreCompleto(usuarioDTO.nombreCompleto()).contrasenia(usuarioDTO.contrasenia()).fechaNacimiento(usuarioDTO.fechaNacimiento()).build();
    }

    private String encode(String password){
        var passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }
}
