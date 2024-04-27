package Ejercicio3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double base;
        double altura;
        System.out.println("Vamos a calcular el area de un triangulo. Ingrese los datos:");
        while (true) {
            try {
                System.out.print("Base: ");
                base = Double.parseDouble(leer.nextLine());
                System.out.print("Altura: ");
                altura = Double.parseDouble(leer.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
            }
        }
        System.out.println("El area del triangulo es " + ((base * altura) / 2));
    }
}
