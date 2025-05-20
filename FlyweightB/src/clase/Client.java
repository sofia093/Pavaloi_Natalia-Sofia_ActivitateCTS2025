package clase;

public class Client implements IClient {
    private String nume;
    private String nrTelefon;

    public Client(String nume, String nrTelefon) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void descrieRezervare(Masa masa) {
        System.out.println(nume+" are rezervare la masa "+ masa.getNrMasa()+ " pentru "+ masa.getNrPersoane()+" de persoane");
    }
}
