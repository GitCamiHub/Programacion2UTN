package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<String> diasSemana = new ArrayList<>();
        ListaDias lista1 = new ListaDias(diasSemana);
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miercoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");

        System.out.println("Lista original: ");
        mostrarLista(diasSemana);
        System.out.println("---------------------------------------------");

        // Inserta en la posición 4 el elemento “Juernes”
        System.out.println("Agregamos Juernes en la posicion 4:");
        diasSemana.add(4,"Juernes");
        mostrarLista(diasSemana);
        System.out.println("---------------------------------------------");

        //Muestra el contenido de las posiciones 3 y 4 de la lista.
        System.out.println("Posicion 3: " + diasSemana.get(3));
        System.out.println("Posicion 4: " + diasSemana.get(4));
        System.out.println("---------------------------------------------");

        //Muestra el primer elemento y el último de la lista.
        System.out.println("Primer elemento: " + diasSemana.get(0));
        System.out.println("Ultimo elemento: " + diasSemana.get(diasSemana.size()-1));
        System.out.println("---------------------------------------------");

        //Elimina el elemento que contenga “Juernes” de la lista y comprueba que haya sido
        //eliminado.
        System.out.println("Eliminamos Juernes y comprobamos si la lista contiene Juernes: ");
        diasSemana.remove("Juernes");
        System.out.println(diasSemana.contains("Juernes"));
        System.out.println("---------------------------------------------");

        //Crea un iterador y muestras uno a uno los valores de la lista.
        Iterator<String>iterador = diasSemana.iterator();
        System.out.println("Mostramos la lista con iterador: ");
        while (iterador.hasNext()){
            String dia = iterador.next();
            System.out.println(dia);
        }
        System.out.println("---------------------------------------------");

        //Busca si existe en la lista un elemento que se denomine “Lunes”.
        System.out.println("Buscamos el elemento \"Lunes\" con contains: ");
        System.out.println(diasSemana.contains("Lunes"));
        System.out.println("---------------------------------------------");

        // Busca si existe en la lista un elemento que se denomine “Lunes”. No importa si está en
        //mayúscula o minúscula.
        System.out.println("Buscamos \"lunes\" sin importar si esta en mayuscula o minuscula:");
        int contador=0;
        Iterator<String>iterador2 = diasSemana.iterator();
        while (iterador2.hasNext()){
            String dia = iterador2.next();
            if(dia.equalsIgnoreCase("lunes")){
                contador++;
                System.out.println("Existe un elemento llamado Lunes");
            }
        }
        if (contador==0){
            System.out.println("No existe un elemento llamado Lunes");
        }
        System.out.println("---------------------------------------------");

        // Borra todos los elementos de la lista.
        System.out.println("Borramos todos los elementos de la lista.");
        diasSemana.clear();
        System.out.println("Comprobamos si se borro todo con isEmpty:");
        System.out.println(diasSemana.isEmpty());
    }

    public static void mostrarLista(List<String> diasSemana){
        for (String lista: diasSemana) {
            System.out.println(lista);
        }
    }
}
