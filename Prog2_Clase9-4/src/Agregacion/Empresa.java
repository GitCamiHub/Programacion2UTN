package Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Departamento> departamentos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    public void verDepartamentos(){
        System.out.println("\nLos departamentos de la empresa son: ");
        for (Departamento depto: departamentos) {
            System.out.println(depto);
        }
    }
}
