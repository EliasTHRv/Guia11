package entidad;

/**
 * Realiza un programa en donde una clase Persona tenga como atributo nombre,
 * apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la
 * serie (carácter) y número. Prueba acceder luego a los atributos del dni de la
 * persona creando objetos y jugando desde el main.
 *
 * @author elias
 */
public class Persona {

    private String nombre;
    private String apellido;
    private Dni dn1;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni dn1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dn1 = dn1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dni getDn1() {
        return dn1;
    }

    public void setDn1(Dni dn1) {
        this.dn1 = dn1;
    }

    @Override
    public String toString() {
        return "La persona: " + nombre+ " " + apellido + " su DNI " + dn1;
    }
    
    
    
}
