package EjercicioEquipo;

import java.util.Iterator;
import java.util.List;

public class JugadorIterator implements Iterator<Jugador> {
    private List<Jugador> jugadores;
    private int indice = 0;

    public JugadorIterator(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public boolean hasNext() {
        return indice < jugadores.size();
    }

    @Override
    public Jugador next() {
        return jugadores.get(indice++);
    }
}
