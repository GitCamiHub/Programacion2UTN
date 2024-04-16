import EjercicioEquipo.Equipo;
import EjercicioEquipo.Jugador;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        Jugador j1 = new Jugador("Lionel Messi","delantero",10);
        Jugador j2 = new Jugador("Dibu Martinez","arquero",1);
        Jugador j3 = new Jugador("Lautaro Martinez","delantero",9);

        equipo.addJugador(j1);
        equipo.addJugador(j2);
        equipo.addJugador(j3);

        System.out.println("Jugadores de la seleccion:");
        for (Jugador jugador : equipo) {
            System.out.println(jugador);
        }
    }
}