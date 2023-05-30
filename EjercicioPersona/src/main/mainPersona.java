package main;

import entidad.Dni;
import entidad.Persona;
import java.util.ArrayList;

/**
 *
 * @author elias
 */
public class mainPersona {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        
        Persona p1 = new Persona("Elias", "Barreto", null);
        Persona p2 = new Persona("Gonzalo", "Pizarro", null);
        
        Dni d1 = new Dni("L", 35497782);
        Dni d2 = new Dni("F", 38362782);
        
        p1.setDn1(d1);
        p2.setDn1(d2);
        
        personas.add(p1);
        personas.add(p2);
        
        for (Persona persona : personas)
        {
            System.out.println(persona.toString());
        }
        
    }
    
}
