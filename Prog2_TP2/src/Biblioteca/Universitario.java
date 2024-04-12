package Biblioteca;

public class Universitario extends Libro{
    private String tipo;

    public Universitario(String titulo, String autor, int anioPublicacion, String tipo) {
        super(titulo, autor, anioPublicacion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nUniversitario: " + tipo;
    }
}
