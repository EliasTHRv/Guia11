/*
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 */
package entidad;

import java.util.Random;

/**
 *
 * @author elias
 */
public class revolverAgua {
    
    private Integer posicionActual;
    private Integer posicionAgua;

    public revolverAgua() {
    }

    public revolverAgua(Integer posicionActua, Integer posicionAgua) {
        this.posicionActual = posicionActua;
        this.posicionAgua = posicionAgua;
    }
    
    public Integer getPosicionActua() {
        return posicionActual;
    }

    public void setPosicionActua(Integer posicionActua) {
        this.posicionActual = posicionActua;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "revolverAgua{" + "posicionActua=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    public void llenarRevolver(){
        Random r1 = new Random();
        this.posicionActual = r1.nextInt(6);
        this.posicionAgua = r1.nextInt(6);
    }
    
    // devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(){
        return this.posicionActual == this.posicionAgua;
    }
    
    // siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(){
        if (this.posicionActual == 5)
        {
         this.posicionActual = 0;
        } else
        {
            this.posicionActual = this.posicionActual +1;
        }
    }
    
}
