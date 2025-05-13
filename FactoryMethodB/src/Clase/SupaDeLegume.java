package Clase;

public class SupaDeLegume extends Mancare{
    private double cantitate;

    public SupaDeLegume(String nume, double pret, double cantitate) {
        super(nume, pret);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaDeLegume{");
        sb.append("cantitatea de legume=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
