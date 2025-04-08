package Clase;

public abstract class Angajat {
    private String nume;
    private double Salariu;

    public Angajat(String nume, double salariu) {
        this.nume = nume;
        Salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", Salariu=").append(Salariu);
        sb.append('}');
        return sb.toString();
    }
}
