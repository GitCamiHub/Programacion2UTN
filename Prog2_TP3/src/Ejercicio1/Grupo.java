package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String curso;
    private char letra;
    public List<Alumno> alumnos;
    public List<Asignatura>asignaturas;


    public Grupo(String curso, char letra) {
        this.curso = curso;
        this.letra = letra;
        this.alumnos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
        alumno.agregarGrupo(this);
    }

    public void mostrarAlumnos(){
        for (Alumno alumno:alumnos) {
            System.out.println(alumno);
        }
    }

    public void agregarAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }
    public void mostrarAsignaturas(){
        for (Asignatura asignatura:asignaturas) {
            System.out.println(asignatura);
        }
    }
    public Asignatura obtenerAsignatura(int posicion){
        return asignaturas.get(posicion);
    }

    @Override
    public String toString() {
        return curso + " " + letra;
    }
}
