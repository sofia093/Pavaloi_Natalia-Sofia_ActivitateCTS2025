package clase.STB;

import clase.Observer;

public class Client implements Observer {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume + ", ai primit mesajul: " + mesaj);
    }
}
