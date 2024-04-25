package Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        Validador validador = new Validador();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\nLISTA DE TAREAS.");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Cantidad de tareas a realizar");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opción: ");
            try {
                opcion = leer.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error.");
                leer.nextLine();
            }
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingrese la descripción de la tarea: ");
                        String descripcion = leer.next();
                        System.out.print("Ingrese la prioridad de la tarea (Del 1 al 10): ");
                        int prioridad = leer.nextInt();
                        if(validador.validarDescripcion(descripcion) && validador.validarPrioridad(prioridad)) {
                            listaDeTareas.agregarTarea(descripcion, prioridad);
                        }
                    }catch (DescripcionException | PrioridadException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("\nLista de tareas:");
                    listaDeTareas.mostrarTareasPorPrioridad();
                    break;
                case 3:
                    System.out.println("\nCantidad de tareas: " + listaDeTareas.obtenerNumeroTareas());
                    break;
                case 4:
                    System.out.print("\nIngrese la descripción de la tarea que desea eliminar: ");
                    String descripcionEliminar = leer.next();
                    listaDeTareas.eliminarTarea(descripcionEliminar);
                    break;
                case 5:
                    System.out.println("\nSaliendo.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 5.");
            }

        }
    }
}

