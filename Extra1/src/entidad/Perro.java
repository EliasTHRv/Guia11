package entidad;

/**
 *
 * @author elias
 */
public class Perro {
    private String nombrePerro;
    private String razaPerro;
    private Integer edad;
    private String tamanioPerro;

    public Perro() {
    }
    
    public Perro(String nombrePerro, String razaPerro, Integer edad, String tamañoPerro) {
        this.nombrePerro = nombrePerro;
        this.razaPerro = razaPerro;
        this.edad = edad;
        this.tamanioPerro = tamañoPerro;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanioPerro() {
        return tamanioPerro;
    }

    public void setTamanioPerro(String tamanioPerro) {
        this.tamanioPerro = tamanioPerro;
    }

    @Override
    public String toString() {
        return "El perro "  + nombrePerro + " de raza: " + razaPerro + " edad: " + edad + " y tamaño" + tamanioPerro;
    }
    
    
    
    
    
}
