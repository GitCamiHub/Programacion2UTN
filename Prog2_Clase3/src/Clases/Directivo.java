package Clases;

public class Directivo extends Empleado{
    private String sector;

    public Directivo() {
    }

    public Directivo(String nombre, String sector) {
        super(nombre);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return super.toString() + " - Directivo" + "\nSector: " + sector;
    }

    public void darOrden(){
        System.out.println("A trabajar!");
    }
}
