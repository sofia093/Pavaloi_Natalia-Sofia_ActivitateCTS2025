package clase;

public class RetetaOnline extends RetetaDecorator{
    private String platforma;

    public RetetaOnline(IReteta reteta, String platforma) {
        super(reteta);
        this.platforma = platforma;
    }

    @Override
    public void daReteta(Pacient pacient) {
        super.daReteta(pacient);
    }

    @Override
    public void daRezultaul(Pacient pacient) {
        System.out.println("S-a primit rezultatul pe platfoma: " + platforma);
    }
}
