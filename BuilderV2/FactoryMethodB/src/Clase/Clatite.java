package Clase;

public class Clatite extends Mancare{
    private String sos;

    public Clatite(String nume, double pret, String sos) {
        super(nume, pret);
        this.sos = sos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clatite");
        sb.append(" cu sos de ").append(sos);
        return sb.toString();
    }
}
