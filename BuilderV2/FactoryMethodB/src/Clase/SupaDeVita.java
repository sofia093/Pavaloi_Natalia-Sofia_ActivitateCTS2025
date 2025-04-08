package Clase;

public class SupaDeVita extends Mancare{
    private double cantitate;

    public SupaDeVita(String nume, double pret, double cantitate) {
        super(nume, pret);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaDeVita{");
        sb.append("cantitatea de vita=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
