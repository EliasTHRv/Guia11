package main;

import entidad.Juego;

/**
 *
 * @author elias
 */
public class mainJuego {
    public static void main(String[] args) {
        Juego j1 = new Juego();
        
        j1.llenarJuego();
        j1.ronda();
    }
    
}
