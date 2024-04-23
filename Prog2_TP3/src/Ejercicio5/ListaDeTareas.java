package Ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaDeTareas implements Iterable<Tarea> {
    private List<Tarea> tareas;

    public ListaDeTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion,int prioridad) {
        tareas.add(new Tarea(descripcion,prioridad));
    }

    public void eliminarTarea(String descripcion) {
        Iterator<Tarea> iterador = iterator();
        int contador=0;
        while (iterador.hasNext()) {
            Tarea tareaActual = iterador.next();
            if (tareaActual.getDescripcion().equals(descripcion)) {
               tareas.remove(tareaActual);
               contador++;
                break;
            }
        }
        if(contador == 0){
            System.out.println("No se encontró una tarea con esa descripción.");
        }
    }

    public int obtenerNumeroTareas() {
        return tareas.size();
    }

    public void mostrarTareasPorPrioridad() {
        List<Integer> prioridadesDescendentes = new ArrayList<>();
        for (Tarea tarea : tareas) {
            prioridadesDescendentes.add(tarea.getPrioridad());
        }
        bubbleSort(prioridadesDescendentes);
        for (Integer aux : prioridadesDescendentes) {
            for (Tarea tarea : tareas) {
                if (aux == tarea.getPrioridad()) {
                    System.out.println(tarea);
                }
            }
        }

    }

    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
        @Override
        public Iterator<Tarea> iterator() {
            return new IteradorTareas(tareas);
        }
    }

