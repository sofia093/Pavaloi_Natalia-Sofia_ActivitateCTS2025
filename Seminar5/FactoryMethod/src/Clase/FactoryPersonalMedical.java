package Clase;

public class FactoryPersonalMedical implements FactoryPersonal{
    private double spor;

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat create(TipPersonal tipPersonal, String nume, double nr) {
        return switch(tipPersonal){
            case TipPersonalMedical.ASISTENT-> new Asistent(nume,nr);
            case TipPersonalMedical.MEDIC ->  new Medic(nume,nr, spor);
            default -> null;
        };
    }
}
