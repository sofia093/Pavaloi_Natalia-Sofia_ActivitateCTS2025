package clase;

public class Pacient implements IPacient {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume+ ", ai primit notificarea: " + mesaj);
    }

}
