package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Validador validador = new Validador();
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
            try {
                opcion = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error:");
                leer.nextLine();
            }

            switch (opcion) {
                case 1:
                    String nombre;
                    int edad;
                    double nota;
                    System.out.println("\nAGREGAR ALUMNO.");
                    try {
                        System.out.print("Nombre: ");
                        nombre = leer.next();
                        System.out.print("Edad: ");
                        edad = leer.nextInt();
                        System.out.print("Nota: ");
                        nota = leer.nextDouble();
                        if(validador.nombreValido(nombre)&&validador.edadValida(edad)&&validador.notaValida(nota)){
                            escuela.agregarAlumno(new Alumno(nombre, edad, nota));
                        }
                    } catch (EdadNoValidaException | NotaNoValidaException | NombreNoValidoException e){
                        System.out.println(e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Ingrese un numero válido.");
                        leer.nextLine();
                    }

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
                    System.out.println("\nSaliendo.");
                    break;
                default:
                    System.out.println("Ingrese un numero entre 1 y 6.");
            }
        }
        leer.close();

    }
}
