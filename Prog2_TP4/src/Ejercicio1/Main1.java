package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random()*100)+1;
        int intentos = 0;
        int numeroIngresado;
        System.out.println("ADIVINA EL NUMERO SECRETO ENTRE 1 Y 100");
        while(true){
            System.out.print("Numero: ");
            try {
                numeroIngresado = Integer.parseInt(leer.nextLine());
                if(numeroIngresado==numeroSecreto){
                    intentos++;
                    System.out.println("ADIVINASTE!!! El numero secreto es " + numeroSecreto + ". Cantidad de intentos: " + intentos);
                    break;
                } else if (numeroIngresado>numeroSecreto) {
                    System.out.println("El numero secreto es mas chico.");
                    intentos++;
                } else{
                    System.out.println("El numero secreto es mas grande");
                    intentos++;
                }
            }catch (NumberFormatException e){
                System.out.println("Tenes que ingresar un numero entero entre 1 y 100");
                intentos++;
            }
        }
    }
}
