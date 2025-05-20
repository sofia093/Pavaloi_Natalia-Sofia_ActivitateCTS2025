package clase;

public class InternareUrgenta extends AInternare {
    private int timp;

    public InternareUrgenta(int timp) {
        this.timp = timp;
    }

    @Override
    public void analizaStare() {
        System.out.println("S-a analizat starea pacientului");
    }

    @Override
    public void verificareDisponibilitate() {
        System.out.println("S-a verificat disponibilitatea salonului");
    }

    @Override
    public void emitereFisaIternare() {
        System.out.println("S-a emis fisa de internare in limita timpului de " + timp + " ore");
    }
}
