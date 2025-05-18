package clase;

public class ProxyRezervare implements IRezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    public ProxyRezervare(ClientRezervare clientRezervare) {
        this.rezervare = new Rezervare(clientRezervare);
    }

    @Override
    public void detalii() {
        System.out.println("Rezervare pentru maxim 4 persoane");
    }

    @Override
    public void rezervaMasa() {
        if(rezervare.getClientRezervare().getNrPersoane() >= 4){
            rezervare.rezervaMasa();
        }else{
            System.out.println("Nu se pot face rezervari pentru mai putin de 4 persoane.");
        }
    }
}
