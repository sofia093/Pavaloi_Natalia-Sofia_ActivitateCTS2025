package clase;

public class Rezervare implements IRezervare {
    private ClientRezervare clientRezervare;

    public ClientRezervare getClientRezervare() {
        return clientRezervare;
    }

    public void setClientRezervare(ClientRezervare clientRezervare) {
        this.clientRezervare = clientRezervare;
    }

    public Rezervare(ClientRezervare clientRezervare) {
        this.clientRezervare = clientRezervare;
    }

    @Override
    public void detalii() {
        System.out.println("Rezervare pentru orice nr de persoane");
    }

    @Override
    public void rezervaMasa() {
        System.out.println(clientRezervare.getNume() + " a rezervat masa");
    }
}
