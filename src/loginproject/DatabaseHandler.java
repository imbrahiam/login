package loginproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {
    
    private static String dbuser = "root";
    private static String pass = "Brahiam2004$";

    public static boolean create(Usuario user) {
        
        boolean created = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", dbuser, pass);

            UsuarioDAO usuarioDAO = new UsuarioDAOImpl(conexion);
            
            created = usuarioDAO.insertar(user);

            conexion.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return created;
    }

    public static boolean delete(String username) {

        boolean deleted = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", dbuser, pass);

            UsuarioDAO usuarioDAO = new UsuarioDAOImpl(conexion);
            
            deleted = usuarioDAO.eliminar(username);
            conexion.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return deleted;
    }
    
    public static boolean update(Usuario user, String selectedUsername) {

        boolean updated = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", dbuser, pass);

            UsuarioDAO usuarioDAO = new UsuarioDAOImpl(conexion);
            
            updated = usuarioDAO.actualizar(user, selectedUsername);
            conexion.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return updated;
    }
    
     public static int getUsernameId(String username) {

         int userid = -1;
         
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users",dbuser, pass);

            UsuarioDAO usuarioDAO = new UsuarioDAOImpl(conexion);

            userid = usuarioDAO.obtenerPorUsername(username);
            
            conexion.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return userid;
    }
    
    public static List<Usuario> getAll() {
        
        List<Usuario> users = new ArrayList<>();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", dbuser, pass);

            UsuarioDAO usuarioDAO = new UsuarioDAOImpl(conexion);
            
            users = usuarioDAO.obtenerTodos();
            
            /*for (Usuario user: users) {
                System.out.println(user);
            }*/

            conexion.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return users;
    }
    
    public static boolean loginValidation(String username, String password) {
        
        boolean login = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", dbuser, pass);

            UsuarioDAO usuarioDAO = new UsuarioDAOImpl(conexion);
            
            boolean access = usuarioDAO.loginVerifier(username, password);
            
            if (access) login = true;
            
            //System.out.println("access: " + access);

            conexion.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return login;
    }
    
    public static boolean usernameValidation(String username) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", dbuser, pass);

            UsuarioDAO usuarioDAO = new UsuarioDAOImpl(conexion);
            
            boolean already = usuarioDAO.usernameExists(username);
            
            conexion.close();
            
            if (already) return true;
            else return false;       
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
}
