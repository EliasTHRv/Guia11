package servicio;

import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Las operaciones que podrá realizar la baraja son: • barajar(): cambia de
 * posición todas las cartas aleatoriamente. • siguienteCarta(): devuelve la
 * siguiente carta que está en la baraja, cuando no haya más o se haya llegado
 * al final, se indica al usuario que no hay más cartas. • cartasDisponibles():
 * indica el número de cartas que aún se puede repartir. • darCartas(): dado un
 * número de cartas que nos pidan, le devolveremos ese número de cartas. En caso
 * de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos
 * indicárselo al usuario. • cartasMonton(): mostramos aquellas cartas que ya
 * han salido, si no ha salido ninguna indicárselo al usuario • mostrarBaraja():
 * muestra todas las cartas hasta el final. Es decir, si se saca una carta y
 * luego se llama al método, este no mostrara esa primera carta.
 *
 * @author elias
 */
public class servicioJuego {

    private Baraja barajaN1 = new Baraja();
    // cree un array list de monton para no tener conflictos con el espacio en memoria
    private ArrayList<Carta> monton = barajaN1.getMontonCartas();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Baraja crearBaraja() {
        String[] palos =
        {
            "Basto", "Oro", "Espada", "Copa"
        };
        ArrayList<Carta> mazo = new ArrayList();
        for (int j = 0; j < palos.length; j++)
        {
            for (int i = 1; i <= 12; i++)
            {
                if (i == 8 || i == 9)
                {
                    continue;
                }
                mazo.add(new Carta(i, palos[j]));
            }
        }

        barajaN1.setMazo(mazo);
        return barajaN1;
    }

    //este metodo baraja las castas con la utilidad SHUFFLE de collections
    public void barajarCartas() {
        System.out.println("Se barajo el mazo: ");
        Collections.shuffle(barajaN1.getMazo());
    }

    public void siguienteCarta() {
        if (barajaN1.getMazo().size() > 1)
        {
            System.out.println("La carta se entrego. " + barajaN1.getMazo().get(0));
            monton.add(barajaN1.getMazo().get(0));
            barajaN1.getMazo().remove(0);
        } else if (barajaN1.getMazo().size() == 1)
        {
            System.out.println("La carta se entrego. " + barajaN1.getMazo().get(0));
            monton.add(barajaN1.getMazo().remove(0));
            System.out.println("NO QUEDAN MAS CARTAS!!!");
        }
    }

    // muestra las cartas disponibles por repartir aun en el mazo
    public void cartasDisponibles() {
        System.out.println("Quedan " + barajaN1.getMazo().size() + " cartas por repartir.");
    }

    public void darCartas() {
        System.out.println("Cuantas cartas quiere pedir?");
        int cartasPedidas = leer.nextInt();

        if (cartasPedidas > barajaN1.getMazo().size())
        {
            System.out.println("No quedan la cantidad que solicito :c ");
        } else
        {
            for (int i = 0; i < cartasPedidas; i++)
            {
                siguienteCarta();
            }
        }
    }

    public void cartasMonton() {
        if (barajaN1.getMontonCartas().isEmpty())
        {
            System.out.println("No han salido cartas.");
        } else
        {
            System.out.println(barajaN1.getMontonCartas());
        }
    }

    //         System.out.println(barajaN1.getMazo());
    public void mostrarBaraja() {
        for (Carta montonCarta : barajaN1.getMazo())
        {
            System.out.println(montonCarta.toString());
        }
    }

    public void menuJuego() {
        int op = 0;
        String confirmacion = "";
            System.out.println("Bienvenido al casi juego!!");

        do
        {
            System.out.println(" ");
            System.out.println("Que desea hacer?");
            System.out.println("1: Crear una nueva baraja.");
            System.out.println("2: Barajar el mazo.");
            System.out.println("3: Ver cuantas cartas hay disponible en el mazo.");
            System.out.println("4: Obtener una carta.");
            System.out.println("5: Pedir una cantidad de cartas.");
            System.out.println("6: Ver las cartas del monton.");
            System.out.println("7: Ver las cartas del mazo.");
            System.out.println("8: Salir");
            op = leer.nextInt();
            switch (op)
            {
                case 1:
                    crearBaraja();
                    break;
                case 2:
                    barajarCartas();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    siguienteCarta();
                    break;
                case 5:
                    darCartas();
                    break;
                case 6:
                    cartasMonton();
                    break;
                case 7:
                    mostrarBaraja();
                    break;
                default:
                    System.out.println("Desea salir? S/N");
                    confirmacion = leer.next();
                    break;
            }
        } while (!confirmacion.equalsIgnoreCase("S"));

    }

}
