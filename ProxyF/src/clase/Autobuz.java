package clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz {
    private int linie;
    private List<Client> lista;

    public Autobuz(int linie) {
        this.linie = linie;
        this.lista = new ArrayList<Client>();
    }

    public void urcaClient(Client client){
        this.lista.add(client);
    }

    public List<Client> getLista() {
        return lista;
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println("Autobuzul "+ linie+ " merge prin fiecare statie.");
    }
}
