package semana7_museo;

public class Galeria {

    private String ubicacionGaleria;
    private String nombreGaleria;

    public String getUbicacionGaleria() {
        return ubicacionGaleria;
    }

    public void setUbicacionGaleria(String ubicacionGaleria) {
        this.ubicacionGaleria = ubicacionGaleria;
    }

    public String getNombreGaleria() {
        return nombreGaleria;
    }

    public void setNombreGaleria(String nombreGaleria) {
        this.nombreGaleria = nombreGaleria;
    }

    public String CrearGaleria(String nombreGaleria, String ubicacionGaleria) {
        this.setNombreGaleria(nombreGaleria);
        this.setUbicacionGaleria(ubicacionGaleria);
        return "Galeria creada correctamente";
    }

    public void ActualizarGaleria() {

    }

    public void EliminarGaleria() {

    }

    public void MostrarGaleria() {

    }
}
