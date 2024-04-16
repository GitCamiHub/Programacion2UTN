package EjercicioEquipo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Equipo implements Iterable<Jugador>{
    private List<Jugador> jugadores;
    public Equipo(){
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    @Override
    public Iterator<Jugador> iterator() {
        return new JugadorIterator(jugadores);
    }

}
