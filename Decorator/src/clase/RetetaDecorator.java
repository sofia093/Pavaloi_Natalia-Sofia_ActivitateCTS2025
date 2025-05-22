package clase;

public abstract class RetetaDecorator implements IReteta {
    private IReteta rezultatFizic;

    public RetetaDecorator(IReteta rezultatFizic) {
        this.rezultatFizic = rezultatFizic;
    }

    @Override
    public void daReteta(Pacient pacient) {
        System.out.println("S-au postat pe platforma online rezultatele.");
        rezultatFizic.daReteta(pacient);
    }

    public abstract void daRezultaul(Pacient pacient);

}
