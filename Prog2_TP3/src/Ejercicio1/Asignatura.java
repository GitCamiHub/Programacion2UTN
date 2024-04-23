package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private int aula;
    private String hora;
    private Grupo recibe;
    private Profesor profesor;

    public Asignatura(String nombre, int aula, String hora, Grupo grupo, Profesor profesor) {
        this.nombre = nombre;
        this.aula = aula;
        this.hora = hora;
        this.recibe = grupo;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Grupo getRecibe() {
        return recibe;
    }

    public void setRecibe(Grupo recibe) {
        this.recibe = recibe;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return  nombre + ", aula " + aula + ", " + hora;
    }
}
