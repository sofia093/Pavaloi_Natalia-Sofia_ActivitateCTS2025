package Factories;

import clase.Angajat;
import clase.Portar;
import clase.Secretar;

public class FactoryPersonalNonMedical implements FactoryPersonal {
    private double vechime;

    public void setVechime(double vechime) {
        this.vechime = vechime;
    }

    public FactoryPersonalNonMedical(double vechime) {
        this.vechime = vechime;
    }

    @Override
    public Angajat create(TipPersonal tipPersonal, String nume, double salariu) {
        return switch(tipPersonal){
            case TipPersonalNonMedical.SECRETAR -> new Secretar(nume,salariu, vechime);
            case TipPersonalNonMedical.PORTAR -> new Portar(nume, salariu, vechime);

            default -> null;
        };
    }
}
