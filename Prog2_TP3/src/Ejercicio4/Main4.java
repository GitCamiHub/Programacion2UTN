package Ejercicio4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Escuela escuela = new Escuela();
        Alumno alumno;
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("\nIngrese el numero de la opcion elegida: ");
            System.out.println("1. Agregar alumno a la lista.");
            System.out.println("2. Ver lista de alumnos");
            System.out.println("3. Calcular el promedio de notas.");
            System.out.println("4. Ver alumno con la nota mas alta.");
            System.out.println("5. Buscar alumno");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nAGREGAR ALUMNO.");
                    System.out.print("Nombre: ");
                    String nombre = leer.next();
                    System.out.print("Edad: ");
                    int edad = leer.nextInt();
                    System.out.print("Nota: ");
                    double nota = leer.nextDouble();
                    escuela.agregarAlumno(new Alumno(nombre, edad, nota));
                    break;
                case 2:
                    System.out.println("\nALUMNOS DE LA ESCUELA.");
                    escuela.mostrarAlumnos();
                    break;
                case 3:
                    System.out.println("\nPROMEDIO DE LAS NOTAS DE TODOS LOS ALUMNOS.");
                    escuela.calcularPromedio();
                    break;
                case 4:
                    System.out.println("\nNOTA MAS ALTA.");
                    escuela.mostrarNotaMasAlta();
                    break;
                case 5:
                    System.out.println("\nBUSCAR ALUMNO.");
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombreAlumno = leer.next();
                    escuela.buscarNombreAlumno(nombreAlumno);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("\nIngrese un numero entre 1 y 6.");
            }
        }

    }
}
