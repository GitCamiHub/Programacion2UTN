package Ejercicio5;

import java.util.Iterator;
import java.util.List;

public class IteradorTareas implements Iterator<Tarea> {
    private List<Tarea> tareas;
    private int posicionLista;

    public IteradorTareas(List<Tarea> tareas) {
        this.tareas = tareas;
        this.posicionLista = 0;
    }

    @Override
    public boolean hasNext() {
        return posicionLista < tareas.size();
    }

    @Override
    public Tarea next() {
        return tareas.get(posicionLista++);
    }

}
