package TiendaAnimales;

public class Ave extends Animal{
    private String especie;
    private boolean habla;

    public Ave(String nombre, int edad, double precio, String tipoAnimal, String especie, boolean habla) {
        super(nombre, edad, precio, tipoAnimal);
        this.especie = especie;
        this.habla = habla;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    @Override
    public String toString() {
        return super.toString() + "\nEspecie: " + especie + "\nHabla: " + habla;
    }
}
