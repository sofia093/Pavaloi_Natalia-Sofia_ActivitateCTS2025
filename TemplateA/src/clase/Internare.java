package clase;

public class Internare extends AInternare{
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
        System.out.println("S-a emis fisa de internare.");
    }
}
