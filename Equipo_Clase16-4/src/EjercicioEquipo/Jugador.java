package EjercicioEquipo;

public class Jugador {
    private String nombre;
    private String posicion;
    private int nroCamiseta;

    public Jugador(String nombre, String posicion, int nroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    @Override
    public String toString() {
        return nombre + " juega de " + posicion + " con la camiseta numero " + nroCamiseta;
    }
}
