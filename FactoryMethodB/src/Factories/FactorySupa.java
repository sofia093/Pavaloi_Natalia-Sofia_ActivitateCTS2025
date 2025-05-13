package Factories;

import Clase.Mancare;
import Clase.SupaDeLegume;
import Clase.SupaDeVita;

public class FactorySupa implements FactoryMancare{
    private double cantitate;

    public FactorySupa(double cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public Mancare createMancare(TipMancare tipMancare, String nume, double pret) {
        return switch (tipMancare){
            case TipSupa.SupaDeLegume -> new SupaDeLegume(nume,pret,cantitate);
            case TipSupa.SupaDeVita -> new SupaDeVita(nume,pret,cantitate);
            default -> null;
        };
    }
}
