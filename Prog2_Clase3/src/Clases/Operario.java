package Clases;

public class Operario extends Empleado {
    private int id;

    public Operario() {
    }

    public Operario(String nombre, int id) {
        super(nombre);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + " - Operario" + "\nID: " + id;
    }

    public void hablar(){
        System.out.println("Soy un operario ");
    }
}
