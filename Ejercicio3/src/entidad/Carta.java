package entidad;

/**
 *
 * @author elias
 */
public class Carta {
    private int numeroCarta;
    private String paloCarta;

    public Carta() {
    }

    public Carta(int numeroCarta, String paloCarta) {
        this.numeroCarta = numeroCarta;
        this.paloCarta = paloCarta;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public String getPaloCarta() {
        return paloCarta;
    }

    public void setPaloCarta(String paloCarta) {
        this.paloCarta = paloCarta;
    }

    @Override
    public String toString() {
        return " "+   numeroCarta + " " + paloCarta;
    }
    
    
    
}
