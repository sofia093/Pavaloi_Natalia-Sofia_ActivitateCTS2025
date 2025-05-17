package clase.STB;

public class Tramvai extends MijlocTransport{

    public Tramvai(int linie) {
        super(linie);
    }

    @Override
    public void pleacaDinStatie() {
        trimiteMesaj("Tramvaiul "+ getLinie() +" pleaca din statie");
    }

    @Override
    public void schimbaRuta(String strada) {
        trimiteMesaj("Tramvaiul "+ getLinie() + " nu va circula pe " + strada);
    }
}
