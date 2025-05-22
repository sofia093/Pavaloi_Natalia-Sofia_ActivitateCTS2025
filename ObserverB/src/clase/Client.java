package clase;

public class Client implements IClient {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + ", ai primit notificarea: "+ mesaj);
    }
}
