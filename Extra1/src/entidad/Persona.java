package entidad;

/**
 *
 * @author elias
 */
public class Persona {

    private String nombrePersona;
    private String apellidoPersona;
    private Integer edadPersona;
    private Integer dniPersona;

    public Persona() {
    }

    public Persona(String nombrePersona, String apellidoPersona, Integer edadPersona, Integer dniPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.dniPersona = dniPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public Integer getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(Integer edadPersona) {
        this.edadPersona = edadPersona;
    }

    public Integer getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(Integer dniPersona) {
        this.dniPersona = dniPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombrePersona=" + nombrePersona + ", apellidoPersona=" + apellidoPersona + ", edadPersona=" + edadPersona + ", dniPersona=" + dniPersona + '}';
    }

    
}
