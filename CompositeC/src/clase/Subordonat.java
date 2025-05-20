package clase;

public class Subordonat extends Angajat {
    private String nume;

    public Subordonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Subordonat: "+ nume);
    }

    @Override
    public void adaugaAngajat(Angajat angajat) {
        throw new RuntimeException("Nu poate avea subordonati");
    }

    @Override
    public void concediazaAngajat(Angajat angajat) {
        throw new RuntimeException("Nu are subordonati");
    }

    @Override
    public Angajat getNodCopil(int index) {
        throw new RuntimeException("Nu are subordonati");
    }
}
