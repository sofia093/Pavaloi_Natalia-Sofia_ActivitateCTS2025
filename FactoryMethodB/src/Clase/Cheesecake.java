package Clase;

public class Cheesecake extends Mancare{
    private String sos;

    public Cheesecake(String nume, double pret, String sos) {
        super(nume, pret);
        this.sos = sos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cheesecake ");
        sb.append("cu sos de ").append(sos);
        return sb.toString();
    }
}
