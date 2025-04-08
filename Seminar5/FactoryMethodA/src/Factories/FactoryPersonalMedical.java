package Factories;

import Clase.Angajat;
import Clase.Asistent;
import Clase.Medic;

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
