package mapper;

import com.example.demo.model.Usuario;
import com.example.demo.dto.UsuarioDTO;

public class UsuarioMapper {

    public static Usuario transformarDTO(UsuarioDTO usuarioDTO) {
        return Usuario.builder().correo(usuarioDTO.correo()).nombreCompleto(usuarioDTO.nombreCompleto()).contrasenia(usuarioDTO.contrasenia()).fechaNacimiento(usuarioDTO.fechaNacimiento()).build();
    }
}
