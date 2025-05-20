package clase;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Angajat{
    private List<Angajat> lista;
    private String nume;

    public Manager( String nume) {
        this.lista = new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Managerul " + nume + " are urmatorii subordonati: ");
        for(Angajat a: lista){
            a.afiseazaDetalii();
        }
    }

    @Override
    public void adaugaAngajat(Angajat angajat) {
        lista.add(angajat);
    }

    @Override
    public void concediazaAngajat(Angajat angajat) {
        lista.remove(angajat);
    }

    @Override
    public Angajat getNodCopil(int index) {
        return lista.get(index);
    }
}
