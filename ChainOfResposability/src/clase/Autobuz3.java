package clase;

public class Autobuz3 extends Autobuz {
    @Override
    public void anuntaComanda(Comanda comanda) {
        if (isDisponibil()) {
            System.out.println("Autobuzul 3 pleaca pe linia " + comanda.getLinie());
            this.devineOcupat();
        }
        else{
            System.out.println("Nu mai sunt autobuze disponibile");
        }

    }
}
