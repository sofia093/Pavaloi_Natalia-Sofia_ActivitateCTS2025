package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ISubiect{
    private List<Client> clienti;

    public Restaurant() {
        this.clienti = new ArrayList<Client>();
    }

    @Override
    public void abonareClient(Client client) {
        clienti.add(client);
    }

    @Override
    public void dezabonareClient(Client client) {
        clienti.remove(client);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Client client : clienti) {
            client.primesteNotificare(mesaj);
        }
    }

    public void trimiteOferta(String oferta){
        trimiteNotificare("Ai primit oferta: "+ oferta);
    }

    public void trimiteMeniu(){
        trimiteNotificare("Ai primit meniul");
    }

}
