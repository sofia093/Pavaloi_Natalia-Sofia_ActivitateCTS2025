package Factories;

import clase.Angajat;
import clase.Asistent;
import clase.Medic;

public class FactoryPersonalMedical implements FactoryPersonal {
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat create(TipPersonal tipPersonal, String nume, double nr) {
        return switch(tipPersonal){
            case TipPersonalMedical.ASISTENT-> new Asistent(nume,nr, spor);
            case TipPersonalMedical.MEDIC ->  new Medic(nume,nr, spor);
            default -> null;
        };
    }
}
