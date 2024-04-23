package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private String departamento;
    private List<Asignatura> imparte;

    public Profesor(String nombre, int dni, String departamento) {
        super(nombre, dni);
        this.departamento = departamento;
        this.imparte = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Asignatura> getImparte() {
        return imparte;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }

    public void agregarAsignatura(Asignatura asignatura){
        imparte.add(asignatura);
    }

    public void mostrarAsignaturas(){
        for (Asignatura asignatura:imparte) {
            System.out.println(asignatura);
        }
    }
}
