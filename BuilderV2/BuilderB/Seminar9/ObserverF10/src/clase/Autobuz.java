package clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int linie) {
        super(linie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul " + getLinie() + " pleaca de la capat.");
    }

    public void schimbaTraseu(){
        trimiteMesaj("Autobuzul " + getLinie() + " va circula astazi prin bdul Balcescu.");

    }
}
