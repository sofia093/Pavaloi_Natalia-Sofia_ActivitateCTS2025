package clase;

public class Client {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Client(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteChitanta(){
        metodaPlata.plateste();
    }
}
