package com.example.demo.services;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.model.Usuario;

public interface UsuarioServices {

    Usuario crearUsuario(UsuarioDTO usuarioDTO);
}
