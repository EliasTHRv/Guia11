package entidad;

/**
 * Realiza un programa en donde una clase Persona tenga como atributo nombre,
 * apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la
 * serie (carácter) y número. Prueba acceder luego a los atributos del dni de la
 * persona creando objetos y jugando desde el main.
 *
 * @author elias
 */
public class Dni {

    private String serie;
    private Integer numeroDni;

    public Dni(String serie, Integer numeroDni) {
        this.serie = serie;
        this.numeroDni = numeroDni;
    }

    public Dni() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(Integer numeroDni) {
        this.numeroDni = numeroDni;
    }

    @Override
    public String toString() {
        return " con serie " + serie + " y N°DNI " + numeroDni + ".";
    }
    
    
    
}
