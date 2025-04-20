package mapper;

import com.example.demo.model.Usuario;
import com.example.demo.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario transformarDTO(UsuarioDTO usuarioDTO) {
        return Usuario.builder().correo(usuarioDTO.correo()).nombreCompleto(usuarioDTO.nombreCompleto()).contrasenia(usuarioDTO.contrasenia()).fechaNacimiento(usuarioDTO.fechaNacimiento()).build();
    }
}
