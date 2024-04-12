package Biblioteca;

public class Infantil extends Libro{
    private String tipoAprendizaje;

    public Infantil(String titulo, String autor, int anioPublicacion, String tipoAprendizaje) {
        super(titulo, autor, anioPublicacion);
        this.tipoAprendizaje = tipoAprendizaje;
    }

    public String getTipoAprendizaje() {
        return tipoAprendizaje;
    }

    public void setTipoAprendizaje(String tipoAprendizaje) {
        this.tipoAprendizaje = tipoAprendizaje;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nAprendizaje: " + tipoAprendizaje;
    }
}
