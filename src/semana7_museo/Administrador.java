package semana7_museo;

public class Administrador extends Usuario{

    private int claveSeguridad;
    private String emailAdministrador;

    public Administrador() {
    }

    public Administrador(String nombreUsuario, String passwordUsuario, String emailUsuario) {
        super(nombreUsuario, passwordUsuario, emailUsuario);
    }

    public Administrador(int claveSeguridad, String emailAdministrador, String nombreUsuario, String passwordUsuario, String emailUsuario) {
        super(nombreUsuario, passwordUsuario, emailUsuario);
        this.claveSeguridad = claveSeguridad;
        this.emailAdministrador = emailAdministrador;
    }
    

    public int getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(int claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public String getEmailAdministrador() {
        return emailAdministrador;
    }

    public void setEmailAdministrador(String emailAdministrador) {
        this.emailAdministrador = emailAdministrador;
    }

    Galeria Gestiona = new Galeria();
}
