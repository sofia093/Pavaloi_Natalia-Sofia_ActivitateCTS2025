package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subiect {
    private int linie;
    private List<Observer> calatori;

    public MijlocTransport(int linie) {
        this.linie = linie;
        this.calatori = new ArrayList<>();
    }

    public int getLinie() {
        return linie;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.calatori.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.calatori.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Observer calator : calatori) {
            calator.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
}
