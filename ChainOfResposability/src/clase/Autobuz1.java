package clase;

public class Autobuz1 extends Autobuz {
    @Override
    public void anuntaComanda(Comanda comanda) {
        if (isDisponibil()) {
            System.out.println("Autobuzul 1 pleaca pe linia " + comanda.getLinie());
            this.devineOcupat();
        }
        else{
            this.getUrmAutobuz().anuntaComanda(comanda);
        }

    }
}
