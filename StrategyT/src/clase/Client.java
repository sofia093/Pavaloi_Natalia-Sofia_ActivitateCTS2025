package clase;

public class Client {
    private String nume;
    private Reducere metodaReducere;

    public Client(String nume, Reducere metodaReducere) {
        this.nume = nume;
        this.metodaReducere = metodaReducere;
    }

    public Client(String nume) {
        this.nume = nume;
    }

    public void setMetodaReducere(Reducere metodaReducere) {
        this.metodaReducere = metodaReducere;
    }

    public void returneazaAnticipat(int sumaBani){
        System.out.println("Clientul "+ nume +" a returnat anticipat");
        metodaReducere.returneazaAnticipat(sumaBani);
    }
}
