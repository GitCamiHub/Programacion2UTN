package TiendaAnimales;

public class Gato extends Animal{
    private String raza;
    private boolean esterilizado;

    public Gato(String nombre, int edad, double precio, String tipoAnimal, String raza, boolean esterilizado) {
        super(nombre, edad, precio, tipoAnimal);
        this.raza = raza;
        this.esterilizado = esterilizado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaza: " + raza + "\nEsterilizado: " + esterilizado;
    }
}
