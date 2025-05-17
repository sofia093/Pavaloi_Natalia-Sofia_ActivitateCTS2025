package clase.STB;

public class Autobuz extends MijlocTransport{

    public Autobuz(int linie) {
        super(linie);
    }

    @Override
    public void pleacaDinStatie() {
        trimiteMesaj("Autobuzul "+ getLinie() +" pleaca din statie");
    }

    @Override
    public void schimbaRuta(String strada) {
        trimiteMesaj("Autobuzul "+ getLinie() + " nu va circula pe " + strada);
    }
}
