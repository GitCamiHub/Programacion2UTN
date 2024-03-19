package Clases;

public class Oficial extends Operario{
    private String puesto;

    public Oficial() {
    }

    public Oficial(String nombre, int id, String puesto) {
        super(nombre, id);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPuesto: " + puesto;
    }

    
}