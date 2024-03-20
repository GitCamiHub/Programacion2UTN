import Herencia.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declaracion variables
        int opcion;
        int cantRuedas;

        // Lista de vehiculos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Instancias de objetos
        Auto auto1 = new Auto("Blanco", 4, 120, 1.8);
        Camioneta camioneta1 = new Camioneta("Negro", 4, 500);
        Bicicleta bici1 = new Bicicleta("Amarillo", 2, "Urbana");
        Moto moto1 = new Moto("Rojo", 2, 130, 1.5);

        // Los agrego a la lista
        vehiculos.add(auto1);
        vehiculos.add(camioneta1);
        vehiculos.add(bici1);
        vehiculos.add(moto1);

        do {
            System.out.println();
            System.out.println("1. Ver todos los vehiculos");
            System.out.println("2. Buscar por cantidad de ruedas");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    catalogar(vehiculos, null);
                    break;
                case 2:
                    System.out.println("Cantidad de ruedas? ");
                    cantRuedas = leer.nextInt();
                    catalogar(vehiculos, cantRuedas);
                    break;
                case 3:
                    System.out.println("Hasta luego!!");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida (1, 2 o 3).");
                    break;
            }
        } while (opcion!= 3);


    }

    // Funcion que devuelve los vehiculos buscados
    public static void catalogar(ArrayList<Vehiculo> vehiculos, Integer ruedas) {
        int contador = 0;
        // Si quiere ver todos los vehiculos
        if (ruedas == null) {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println("Clase: " + vehiculo.getClass().getSimpleName());
                vehiculo.mostrarAtributos();
                System.out.println();
            }
        } else {
            // Si quiere ver solo los vehiculos con cierta cantidad de ruedas
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getCantRuedas() == ruedas) {
                    System.out.println("Clase: " + vehiculo.getClass().getSimpleName());
                    vehiculo.mostrarAtributos();
                    System.out.println();
                    contador++;
                }
            }
            if (contador == 0) {
                System.out.println("No se encontraron vehiculos con la cantidad de ruedas ingresada.");
            } else {
                System.out.println("Se han encontrado " + contador + " vehículos con " + ruedas + " ruedas");
            }
        }
    }
}