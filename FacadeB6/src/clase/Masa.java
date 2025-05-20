package clase;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;
    private boolean esteDebarasata;

    public Masa(int nrMasa, boolean esteLibera, boolean esteDebarasata) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
        this.esteDebarasata = esteDebarasata;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public void setEsteDebarasata(boolean esteDebarasata) {
        this.esteDebarasata = esteDebarasata;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }


}
