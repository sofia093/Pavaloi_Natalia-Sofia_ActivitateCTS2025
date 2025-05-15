package clase;

public class Autobuz2 extends Autobuz {
    @Override
    public void anuntaComanda(Comanda comanda) {
        if (isDisponibil()) {
            System.out.println("Autobuzul 2 pleaca pe linia " + comanda.getLinie());
            this.devineOcupat();
        }
        else{
            this.getUrmAutobuz().anuntaComanda(comanda);
        }

    }
}

