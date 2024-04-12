package TiendaAnimales;

public class Perro extends Animal{
    private String raza;
    private boolean vacunado;

    public Perro(String nombre, int edad, double precio, String tipoAnimal, String raza, boolean vacunado) {
        super(nombre, edad, precio, tipoAnimal);
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
    @Override
    public String toString() {
        return super.toString() + "\nRaza: " + raza + "\nVacunado: " + vacunado;
    }
}
