package entidad;

import java.util.Scanner;

/**
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el
 * número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por
 * ejemplo) y mojado (indica si está mojado o no el jugador). El número de
 * jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está
 * en este rango, por defecto será 6.
 *
 * @author elias
 */
public class Jugador {

    private int id;
    private String nombreJugador;
    boolean mojado;

    public Jugador(int id) {
        System.out.println("Ingrese el nombre del jugador");
        String nombre = leer.next();
        this.nombreJugador = "Jugador " + id + " " + nombre;
        this.id = id;
        this.mojado = false;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void disparo(revolverAgua revolver, Jugador jugador) {
        jugador.setMojado(revolver.mojar());
        revolver.siguienteChorro();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean modajo) {
        this.mojado = modajo;
    }

}
