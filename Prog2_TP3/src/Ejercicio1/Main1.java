package Ejercicio1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Instancias de alumno
        Alumno alumno1 = new Alumno("Maria Becerra", 55555555);
        Alumno alumno2 = new Alumno("Matias Perez", 444444444);
        Alumno alumno3 = new Alumno("Juana Martinez", 33333333);
        // Instancias de grupo
        Grupo grupo1 = new Grupo("Humanidades", 'A');
        Grupo grupo2 = new Grupo("Ciencias Naturales", 'A');
        Grupo grupo3 = new Grupo("Artes", 'B');
        // Instancia de profesor
        Profesor profesor1 = new Profesor("Ernesto Guevara", 11111111, "Humanidades");
        Profesor profesor2 = new Profesor("Gabriel Sanchez", 22222222, "Matematica");
        // Instancias de asignatura
        Asignatura asignatura1 = new Asignatura("Etica", 11, "8hs", grupo1, profesor1);
        Asignatura asignatura2 = new Asignatura("Historia", 23, "10hs", grupo1, profesor1);
        Asignatura asignatura3 = new Asignatura("Matematica", 13, "12hs", grupo3, profesor2);
        Asignatura asignatura4 = new Asignatura("Filosofia", 20, "12hs", grupo2, profesor1);
        // Asignamos un alumnos a grupos
        grupo1.agregarAlumno(alumno1);
        grupo2.agregarAlumno(alumno1);
        grupo3.agregarAlumno(alumno1);
        grupo1.agregarAlumno(alumno2);
        grupo1.agregarAlumno(alumno3);
        // Asignamos asignaturas a un profesor
        profesor1.agregarAsignatura(asignatura1);
        profesor1.agregarAsignatura(asignatura2);
        profesor1.agregarAsignatura(asignatura4);
        profesor2.agregarAsignatura(asignatura3);
        // Asignamos asignaturas a un grupo
        grupo1.agregarAsignatura(asignatura1);
        grupo1.agregarAsignatura(asignatura2);
        grupo3.agregarAsignatura(asignatura3);
        grupo2.agregarAsignatura(asignatura4);
        // Teniendo un objeto de Profesor, muestre el aula de la 3ra. asignatura.
        System.out.println("Aula de la 3ra asignatura que imparte el profesor: ");
        System.out.println(profesor1.getImparte().get(2).getAula());
        System.out.println("-----------------------------------------------------------");

        //Teniendo un profesor, muestre todos los nombres de las asignaturas que imparte.
        System.out.println("Asignaturas que imparte el profesor: ");
        profesor1.mostrarAsignaturas();
        System.out.println("-----------------------------------------------------------");

        //Teniendo una asignatura, muestre nombre y dni de los alumnos del grupo que recibe.
        System.out.println("Alumnos del grupo que recibe la asignatura: ");
        System.out.println("Asignatura: " + asignatura1.getNombre());
        asignatura1.getRecibe().mostrarAlumnos();
        System.out.println("-----------------------------------------------------------");

        //Teniendo un alumno, muestre la letra del 3er. grupo al que pertenece.
        System.out.println("Letra del 3er. grupo al que pertenece la alumna " + alumno1.getNombre() + ": ");
        System.out.println(alumno1.obtenerGrupo(2).getLetra());
        System.out.println("-----------------------------------------------------------");

        //Teniendo un alumno, muestre todas las asignaturas recibidas por el 1er. grupo al que
        //pertenece.
        System.out.println("Asignaturas recibidas por el 1er  grupo de la alumna " + alumno1);
        alumno1.obtenerGrupo(0).mostrarAsignaturas();
        System.out.println("-----------------------------------------------------------");

        //Teniendo un objeto de Alumno y, pidiendo por pantalla, una asignatura existente, muestre
        //desde él, el profesor que la imparte.
        System.out.println("Elija una asignatura: ");
        System.out.println("1. " + asignatura1.getNombre());
        System.out.println("2. " + asignatura2.getNombre());
        System.out.println("3. " + asignatura3.getNombre());
        System.out.println("Opcion: ");
        int opcion = leer.nextInt();
        System.out.println("El profesor que dicta la asignatura es: ");
        switch (opcion) {
            case 1:
                System.out.println(alumno1.obtenerGrupo(0).obtenerAsignatura(0).getProfesor());
                break;
            case 2:
                System.out.println(alumno1.obtenerGrupo(0).obtenerAsignatura(1).getProfesor());
                break;
            case 3:
                System.out.println(alumno1.obtenerGrupo(2).obtenerAsignatura(0).getProfesor());
                break;
            default:
                System.out.println("Ingrese numero 1, 2 o 3.");
        }
        System.out.println("-----------------------------------------------------------");

        // Teniendo un objeto de Profesor, muestre los nombres de todos los alumnos inscriptos en el
        //Grupo de la 2da. Asignatura.
        System.out.println("Alumnos de la 2da. asignatura que dicta el profesor: ");
        profesor1.getImparte().get(1).getRecibe().mostrarAlumnos();


    }
}
