package loginproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UsuarioDAOImpl implements UsuarioDAO {

    private Connection conexion;

    public UsuarioDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public int obtenerPorUsername(String username) {
        String sql = "SELECT * FROM usuarios WHERE username = ?";

        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    @Override
    public boolean loginVerifier(String username, String password) {
        String sql = "SELECT * FROM usuarios WHERE username = ?";
        Usuario session = new Usuario();

        boolean verified = false;

        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            session.setId(rs.getInt("id"));
            session.setUsername(rs.getString("username"));
            session.setNombre(rs.getString("nombre"));

            Management.activeSession = session;

            /*System.out.println(session.getUsername());
            System.out.println(username + password);*/
            if (username.equals(session.getUsername()) && password.equals(rs.getString("password"))) {
                verified = true;
            } else if (username.equals(session.getUsername()) && !password.equals(rs.getString("password"))) {
                verified = false;
                JOptionPane.showMessageDialog(new JFrame(), "¡" + "Contraseña incorrecta" + "!", "", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "¡" + "Información inexistente" + "!", "", JOptionPane.ERROR_MESSAGE);
        }

        return verified;
    }

    @Override
    public List<Usuario> obtenerTodos() {
        String sql = "SELECT * FROM usuarios ORDER BY username ASC";
        List<Usuario> usuarios = new ArrayList<>();

        try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setUsername(rs.getString("username"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setPhone(rs.getString("phone"));
                usuario.setEmail(rs.getString("email"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    @Override
    public boolean insertar(Usuario usuario) {
        
        String sql = "INSERT INTO usuarios (username, nombre, apellido, phone, email, password) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, usuario.getUsername());
            pstmt.setString(2, usuario.getNombre());
            pstmt.setString(3, usuario.getApellido());
            pstmt.setString(4, usuario.getPhone());
            pstmt.setString(5, usuario.getEmail());
            pstmt.setString(6, usuario.getPassword());

            int affected_rows = pstmt.executeUpdate();
            if (affected_rows == 1) return true;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }

    @Override
    public boolean actualizar(Usuario usuario, String selectedUsername) {
        
        boolean updated = false;
        
        String sql = "UPDATE usuarios SET username = ?, nombre = ?, apellido = ?, phone = ?, email = ? WHERE username = ?";

        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, usuario.getUsername());
            pstmt.setString(2, usuario.getNombre());
            pstmt.setString(3, usuario.getApellido());
            pstmt.setString(4, usuario.getPhone());
            pstmt.setString(5, usuario.getEmail());
            pstmt.setString(6, selectedUsername);

            int affected_rows = pstmt.executeUpdate();
            
            /*System.out.println("rows");
            System.out.println(affected_rows);*/
            
            if (affected_rows == 1) updated = true;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return updated;
    }

    @Override
    public boolean eliminar(String username) {

        String sql = "SELECT * FROM usuarios WHERE username = \"" + username + "\";";

        int id = -1;

        try (Statement stmt = conexion.createStatement()) 
        {
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                
                id = rs.getInt("id");
                
                String sqld = "DELETE FROM usuarios WHERE id = " + id ;
                
                System.out.println(id);

                try (Statement stmtd = conexion.createStatement()) {

                    var result = stmtd.executeUpdate(sqld);
                    
                    if (result > 0) return true;

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    @Override
    public boolean usernameExists(String username) {

        String sql = "SELECT * FROM usuarios WHERE username = \"" + username + "\";";

        try (Statement stmt = conexion.createStatement()) 
        {
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                return true;
            }
            else {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
