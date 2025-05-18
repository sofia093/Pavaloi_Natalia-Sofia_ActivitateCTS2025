package clase;

public class ProxySpital implements ISpital {
    private Spital spital;

    public ProxySpital(Spital spital) {
        this.spital = spital;
    }

    public ProxySpital(Pacient pacient) {
        this.spital = new Spital(pacient);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("te poti interna doar cu asigurare");
    }

    @Override
    public void interneaza() {
        if(spital.getPacient().isAreAsigurare()) {
            System.out.println(spital.getPacient().toString() + " s-a internat deoarece are asigurare");
        }else{
            System.out.println("Nu te poti interna fara asiguare");
        }

    }
}
