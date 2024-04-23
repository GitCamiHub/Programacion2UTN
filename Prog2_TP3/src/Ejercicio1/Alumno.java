package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona{
    public List<Grupo> pertenece;

    public Alumno(String nombre, int dni) {
        super(nombre, dni);
        this.pertenece = new ArrayList<>();
    }

    public List<Grupo> getPertenece() {
        return pertenece;
    }

    public void agregarGrupo(Grupo grupo){
        pertenece.add(grupo);
    }

    public Grupo obtenerGrupo(int posicion){
        return pertenece.get(posicion);
    }


}
