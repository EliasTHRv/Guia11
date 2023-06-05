package main;

import servicio.servicioPerrera;

/**
 *
 * @author elias
 */
public class mainPerrera {
    public static void main(String[] args) {
        servicioPerrera p1 = new servicioPerrera();

        p1.cargarPersonasYPerros();
        p1.adopcionPerros();
        p1.mostrarPersonas();

    }

}
