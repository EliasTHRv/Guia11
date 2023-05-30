package main;

import entidad.Equipo;
import entidad.Jugador;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class mainEquipo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Equipo e1 = new Equipo();

        String confir = "";

        do
        {
            Jugador j1 = new Jugador();
            System.out.println("Ingrese el nombre, apellido, posicion y numero del jugador.");
            j1.setNombre(leer.next());
            j1.setApellido(leer.next());
            j1.setPosicion(leer.next());
            j1.setNumero(leer.nextInt());

            System.out.println("Desea cargar otro jugador? S/N");
            confir = leer.next();
           e1.getEquipo().add(j1);
        } while (confir.equalsIgnoreCase("s"));

        for (Jugador jugador : e1.getEquipo())
        {
            System.out.println(jugador.toString());
        }
    }
}
