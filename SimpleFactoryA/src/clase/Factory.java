package clase;

public class Factory {
    private double nr;

    public double getNr() {
        return nr;
    }

    public Factory(double nr) {
        this.nr = nr;
    }

    public Angajat createAngajat(TipPersonal tip, String nume, double salariu) {
        return switch(tip){
            case TipPersonal.Medic -> new Medic(nume, salariu, nr);
            case TipPersonal.Asistent -> new Asistent(nume, salariu , nr);
            default -> null;
        };
    }
}
