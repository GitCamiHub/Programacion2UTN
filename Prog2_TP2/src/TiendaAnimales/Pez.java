package TiendaAnimales;

public class Pez extends Animal{
    private String tipoAgua;

    public Pez(String nombre, int edad, double precio, String tipoAnimal, String tipoAgua) {
        super(nombre, edad, precio, tipoAnimal);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    @Override
    public String toString() {
        return super.toString() + "\nSoy pez de agua " + tipoAgua;
    }
}
