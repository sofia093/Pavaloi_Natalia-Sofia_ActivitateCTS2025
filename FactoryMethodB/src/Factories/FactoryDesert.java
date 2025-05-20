package Factories;

import clase.Cheesecake;
import clase.Clatite;
import clase.Mancare;


public class FactoryDesert implements FactoryMancare{
    private String sos;

    public FactoryDesert(String sos) {
        this.sos = sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    @Override
    public Mancare createMancare(TipMancare tip, String nume, double pret) {
        return switch (tip){
            case TipDesert.Clatite -> new Clatite(nume, pret, sos);
            case TipDesert.Cheesecake -> new Cheesecake(nume, pret, sos);
            default -> null;
        };
    }
}
