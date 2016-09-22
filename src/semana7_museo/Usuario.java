package semana7_museo;

public class Usuario {

    private String nombreUsuario;
    private String passwordUsuario;
    private String emailUsuario;

    public Usuario() {
    }
    
    

    public Usuario(String nombreUsuario, String passwordUsuario, String emailUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.emailUsuario = emailUsuario;
    }
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String Login(String emailUsuario, String passwordUsuario) {
        if (this.emailUsuario.equals(emailUsuario) && this.passwordUsuario.equals(passwordUsuario)) {
            return "Hola " + this.nombreUsuario;
        }
        return "Usuario y/o Contraseña invalido/s.";
    }
}
