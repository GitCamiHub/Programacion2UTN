package Clases;

public class Tecnico extends Operario{
    private String especialidad;

    public Tecnico() {
    }

    public Tecnico(String nombre, int id, String especialidad) {
        super(nombre, id);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidad: " + especialidad;
    }
}
