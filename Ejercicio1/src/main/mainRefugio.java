package main;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;

/**
 *
 * @author elias
 */
public class mainRefugio {

    public static void main(String[] args) {

        ArrayList<Persona> adoptantes = new ArrayList<>();

        Persona adoptante1 = new Persona("Elias", "Barreto", 25, 40597490, null);
        Persona adoptante2 = new Persona("Gonzalo", "Pizarro", 35, 37286893, null);

        Perro perrito1 = new Perro("Lassie", "Collie", 3, "grande");
        Perro perrito2 = new Perro("Hachie", "Hakita", 6, "mediano");

        adoptante1.setPerroAdoptado(perrito2);
        adoptante2.setPerroAdoptado(perrito1);
        
        adoptantes.add(adoptante1);
        adoptantes.add(adoptante2);
      
        
        for (Persona adopcion : adoptantes)
        {
            System.out.println(  adopcion.toString());
            
        }
        
    }

}
