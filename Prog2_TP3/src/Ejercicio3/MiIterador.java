package Ejercicio3;

import java.util.Iterator;
import java.util.List;


public class MiIterador implements Iterator<String> {
    private List<String>diasSemana;
    private int posicionLista;

    public MiIterador(List<String> diasSemana) {
        this.diasSemana = diasSemana;
        this.posicionLista = 0;
    }


    @Override
    public boolean hasNext() {
        return posicionLista< diasSemana.size();
    }

    @Override
    public String next() {
        return diasSemana.get(posicionLista++);
    }
}
