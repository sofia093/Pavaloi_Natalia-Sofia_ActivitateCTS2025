package clase;

public class PrintReteta implements IReteta {

    @Override
    public void daReteta(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a primit rezultatele.");
    }
}
