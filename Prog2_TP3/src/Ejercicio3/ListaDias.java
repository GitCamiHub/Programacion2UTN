package Ejercicio3;

import java.util.Iterator;
import java.util.List;

public class ListaDias implements Iterable<String>{
    public List<String>diasSemana;

    public ListaDias(List<String> diasSemana) {
        this.diasSemana = diasSemana;
    }

    public Iterator<String> iterator(){
        return new MiIterador(diasSemana);
    }


}
