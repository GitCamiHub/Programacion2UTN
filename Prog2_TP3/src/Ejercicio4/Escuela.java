package Ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class Escuela {
    private Set<Alumno> alumnos;

    public Escuela() {
        this.alumnos = new HashSet<>();
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }
    public void agregarAlumno(Alumno alumno){
     alumnos.add(alumno);
    }
    public void mostrarAlumnos(){
        for (Alumno alumno:alumnos) {
            System.out.println(alumno);
        }
    }
    public void calcularPromedio(){
        double sumatoria=0;
        for (Alumno alumno:alumnos) {
            sumatoria += alumno.getNota();
        }
        System.out.println("El promedio de las notas de los alumnos es " + sumatoria/alumnos.size());
    }

    public void mostrarNotaMasAlta(){
        double notaMasAlta=0;
        for (Alumno alumno:alumnos) {
            if(alumno.getNota()>notaMasAlta){
                notaMasAlta= alumno.getNota();
            }
        }
        for (Alumno alumno:alumnos) {
            if(alumno.getNota()==notaMasAlta){
                System.out.println("El alumno con nota mas alta es " + alumno);
            }
        }
    }

    public void buscarNombreAlumno(String nombre){
        int contador=0;
        for (Alumno alumno:alumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(alumno);
                contador++;
            }
        }
        if (contador==0){
            System.out.println("No existe un alumno llamado " + nombre);
        }
    }
}
