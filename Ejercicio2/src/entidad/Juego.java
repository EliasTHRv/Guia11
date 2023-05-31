package entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver Métodos: • llenarJuego(ArrayListjugadores,
 * Revolver r): este método recibe los jugadores y el revolver para guardarlos
 * en los atributos del juego.
 *
 * 10 • ronda(): cada ronda consiste en un jugador que se apunta con el revolver
 * de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja
 * y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que
 * uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe
 * mostrar que jugador se mojó.
 *
 * @author elias
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private revolverAgua revolver;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego() {
        ArrayList<Jugador> jugadores = new ArrayList();
        int cantJugadores;
        do
        {
            System.out.println("Cuántos jugadores desean participar? (Máximo 6)");
            cantJugadores = leer.nextInt();
        } while (cantJugadores > 6 || cantJugadores < 2);
        int id = 1;

        for (int i = 0; i < cantJugadores; i++)
        {
            Jugador jugador = new Jugador(id);
            jugadores.add(jugador);
            id++;
        }
        this.jugadores = jugadores;
        this.revolver = new revolverAgua();
        revolver.llenarRevolver();
    }

    public void ronda() {
        boolean juegoIniciado = true;
        do
        {
            for (Jugador jugador : jugadores)
            {
                jugador.disparo(revolver, jugador);
                System.out.println(" ");
                System.out.println(jugador.getNombreJugador()+ " te toca jugar: ");
                if (jugador.getMojado())
                {
                    System.out.println("Corchazo para vos");
                    System.out.println("Finalizo el juego, el jugador " + jugador.getNombreJugador()+ " se mojo");
                    juegoIniciado = false;
                    break;
                } else
                {
                    System.out.println("Te salvaste, no hubo corchazo");
                    System.out.println(" ");
                }
            }
        } while (juegoIniciado);

    }

}
