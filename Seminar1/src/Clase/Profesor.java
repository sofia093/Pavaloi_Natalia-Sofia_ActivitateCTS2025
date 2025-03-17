package Clase;

import Interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;
    private float salariu;
    private float sporVechime;

    public String getIdAngajat() {
        return idAngajat;
    }

    public float getSalariu() {
        return salariu;
    }

    public float getSporVechime() {
        return sporVechime;
    }

    public Profesor(String nume, int varsta, String idProfesor, float salariu, float sporVechime) {
        super(nume, varsta);
        this.idAngajat = idProfesor;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
    }


    public Profesor() {
        super("Iulia", 17);
        this.idAngajat = "0";
        this.salariu = 0;
        this.sporVechime = 0;
    }

    public void setIdAngajat(String idAngajat) {
        this.idAngajat = idAngajat;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public void setSporVechime(float sporVechime) {
        this.sporVechime = sporVechime;
    }

    @Override
    public void preda() {
        StringBuilder builder = new StringBuilder();
        builder.append("Profesor ").append(this.getNume()).append(" in varsta de ").append(this.varsta).append(" de ani preda la curs.");
        System.out.println(builder.toString());
    }

    @Override
    public float calculVenit() {
        return salariu + sporVechime * salariu;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idAngajat='" + idAngajat + '\'' +
                ", nume=" + getNume() +
                ", salariu=" + salariu +
                ", sporVechime=" + sporVechime +
                ", varsta=" + varsta +
                '}';
    }
}
