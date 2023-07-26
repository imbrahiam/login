package loginproject;

public class Usuario {
    private int id;
    private String username, nombre, apellido, phone, email, password;

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
}
