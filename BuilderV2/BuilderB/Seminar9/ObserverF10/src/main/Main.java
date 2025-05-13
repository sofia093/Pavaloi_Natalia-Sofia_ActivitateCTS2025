package main;


import clase.Autobuz;
import clase.Calator;
import clase.MijlocTransport;
import clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("Andrei");
        Observer calator2 = new Calator("Selma");
        Observer calator3 = new Calator("Ana");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator1);
        ((Autobuz)autobuz).schimbaTraseu();
    }
}