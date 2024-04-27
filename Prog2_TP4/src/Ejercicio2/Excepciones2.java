package Ejercicio2;

import java.util.Scanner;

public class Excepciones2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n;
        int posicion;
        String cadena;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        System.out.println("Contenido del array antes de modificar:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        while (true) {
            System.out.print("\n\nIntroduce la posición del array a modificar: ");
            try {
                cadena = sc.nextLine();
                posicion = Integer.parseInt(cadena);
                if(posicion>=10 || posicion<0){
                    throw new ArrayIndexOutOfBoundsException();
                }
                System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
                n = Double.parseDouble(sc.nextLine());
                valores[posicion] = n;
                break;
            }catch (NumberFormatException e){
                System.out.println("Ingrese un valor correcto.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("El arreglo es de dimension 10. Elija valores entre 0 y 9.");
            }
        }
        System.out.println("\nPosición a modificar " + posicion);
        System.out.println("Nuevo valor: " + n);
        System.out.println("Contenido del array modificado:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }

    }
}
