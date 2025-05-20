package clase;

import Interfete.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    protected int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Persoana() {
        this.nume = "necunoscut";
        this.varsta = 0;
    } //constructor cu valori implicite

    @Override //implementare interfata IPersoana
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public abstract float calculVenit();

}
