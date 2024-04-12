package Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void verEmpleados(){
        System.out.println("\nEmpleados del departamento " + nombre +": ");
        for (Empleado emp: empleados) {
            emp.mostrarEmpleado();
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}
