package clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subiect{
    private List<Observer> pacienti;
    private String nume;

    public Spital( String nume) {
        this.pacienti = new ArrayList<Observer>();
        this.nume = nume;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer o: pacienti){
            o.primesteMesaj("Spitalul " + nume +" anunta: " + mesaj);
        }
    }

    public void anuntaUrgenta(){
        trimiteMesaj("Este o urgenta medicala in oras.");
    }

    public void anuntaVirus(){
        trimiteMesaj("Este un virus nou in oras.");
    }

    @Override
    public void adaugaObserver(Observer observer) {
        pacienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        pacienti.remove(observer);
    }
}
