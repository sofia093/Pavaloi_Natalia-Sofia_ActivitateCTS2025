package clase;

public class Spital implements ISpital {
    private Pacient pacient;

    public Spital(Pacient pacient) {
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Te poti interna si fara asigurare");
    }

    @Override
    public void interneaza() {
        System.out.println(pacient.toString()+ " s-a internat");
    }
}
