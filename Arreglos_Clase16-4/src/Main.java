import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

/* 1.Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del
arreglo está el mayor número leído.*/
        System.out.println("EJERCICIO 1");
        int[] arreglo1 = new int[10];
        System.out.println("Ingrese 10 numeros enteros al arreglo.");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            arreglo1[i] = leer.nextInt();
        }

        int numMayor = arreglo1[0];
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] > numMayor) {
                numMayor = arreglo1[i];
            }
        }
        System.out.println("El mayor numero ingresado es " + numMayor);

/* 2.Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición
 del arreglo está el mayor número primo leído.*/
        System.out.println("\nEJERCICIO 2");
        int[] arreglo2 = new int[10];
        System.out.println("Ingrese 10 numeros enteros al arreglo.");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            arreglo2[i] = leer.nextInt();
        }
        int numPrimoMayor = 0;
        int posicion = -1;
        for (int i = 0; i < arreglo2.length; i++) {
            if (esPrimo(arreglo2[i]) && arreglo2[i] > numPrimoMayor) {
                numPrimoMayor = arreglo2[i];
                posicion = i;
            }
        }
        System.out.println("El mayor numero PRIMO ingresado es " + numPrimoMayor + " y se encuentra en la posicion " + posicion);

/* 3.Almacenar en un arreglo de 10 posiciones los 10 números primos comprendidos
 entre 100 y 300. Luego mostrarlos en pantalla.*/
        System.out.println("\nEJERCICIO 3");
        int[] arreglo3 = new int[10];
        int posicion2 = 0;
        for (int i = 100; i <300 ; i++) {
            if(esPrimo(i) && posicion2<arreglo3.length){
                arreglo3[posicion2]=i;
                posicion2++;
                }
            }
        System.out.println("Los 10 primeros numeros primos comprendidos entre 100 y 300 son:");
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.print("[" + arreglo3[i] + "]");
        }
        System.out.println();

/* 4.Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué posiciones
se encuentran los números terminados en 4.*/
        System.out.println("\nEJERCICIO 4");
       int[] arreglo4 = new int[10];
        ArrayList<Integer>posiciones = new ArrayList<Integer>();
        System.out.println("Ingrese 10 numeros enteros al arreglo.");
        for (int i = 0; i < arreglo4.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            arreglo4[i] = leer.nextInt();
        }
        for (int i = 0; i < arreglo4.length; i++) {
            if(arreglo4[i]%10 == 4){
                posiciones.add(i);
            }
        }

        if(posiciones.isEmpty()){
            System.out.println("No hay numeros terminados en 4");
        }else{
            System.out.println("Los numeros terminados en 4 se encuentran en las siguientes posiciones: ");
            System.out.println(posiciones);
        }

/* 5.Leer 10 números enteros, almacenarlos en un arreglo y determinar cuántas veces
 está repetido el mayor.*/
        System.out.println("\nEJERCICIO 5");
        int[] arreglo5 = new int[10];
        System.out.println("Ingrese 10 numeros enteros al arreglo.");
        for (int i = 0; i < arreglo5.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            arreglo5[i] = leer.nextInt();
        }

        int numMayor5 = arreglo5[0];
        int contador = 0;
        for (int i = 0; i < arreglo5.length; i++) {
            if(arreglo5[i] == numMayor5){
                contador++;
            }
            if (arreglo5[i] > numMayor5) {
                numMayor5 = arreglo5[i];
            }
        }
        System.out.println("El mayor numero ingresado es " + numMayor5 + " y se repite " + contador + " veces");
    }
public static boolean esPrimo(int numero) {
    int contador = 0;
    if (numero <= 1) {
        return false;
    }
    for (int i = 1; i <= numero; i++) {
        if (numero % i == 0) {
            contador++;
        }
    }
    if (contador == 2) {
        return true;
    } else {
        return false;
    }
}
}
