package exceptions;

public class UsuarioNoRegistradoException extends RuntimeException {
    public UsuarioNoRegistradoException() {
        super("El usuario no se encuentra registrado");
    }
}
