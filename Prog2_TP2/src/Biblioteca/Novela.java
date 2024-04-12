package Biblioteca;

public class Novela extends Libro{
    private String tipo;

    public Novela(String titulo, String autor, int anioPublicacion, String tipo) {
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
                "\nTipo: " + tipo;
    }
}
