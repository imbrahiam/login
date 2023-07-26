package loginproject;
import java.util.List;

public interface UsuarioDAO {
    int obtenerPorUsername(String username);
    List<Usuario> obtenerTodos();
    boolean loginVerifier(String username, String password);
    boolean insertar(Usuario usuario);
    boolean actualizar(Usuario usuario, String selectedUsername);
    boolean eliminar(String username);
    boolean usernameExists(String username);
}
