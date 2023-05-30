package entidad;

import java.util.ArrayList;

/**
 *
 * @author elias
 */
public class Equipo {

    private ArrayList<Jugador> equipazo;

    public ArrayList<Jugador> getEquipo() {
        return equipazo;
    }

    public void setEquipo(ArrayList<Jugador> equipazo) {
        this.equipazo = equipazo;
    }

    public Equipo() {
        this.equipazo = new ArrayList();
    }

}
