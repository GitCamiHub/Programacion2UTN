package Punto10;

public class Novelas extends Libro{
    private String tipo;

    public Novelas(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
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
        return super.toString() + "\nTipo: " + tipo;
    }
}
