package clase.STB;

import clase.Observer;
import clase.Subiect;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subiect {
    private int linie;
    private List<Observer> clienti;

    public MijlocTransport(int linie) {
        this.clienti = new ArrayList<Observer>();
        this.linie = linie;
    }

    public int getLinie() {
        return linie;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer o: clienti){
            o.primesteMesaj(mesaj);
        }
    }

    @Override
    public void adaugaObserver(Observer observer) {
        clienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        clienti.remove(observer);
    }

    public abstract void pleacaDinStatie();

    public abstract void schimbaRuta(String strada);
}
