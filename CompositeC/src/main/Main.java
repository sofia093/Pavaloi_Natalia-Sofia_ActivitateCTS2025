package main;

//O companie are o structură ierarhică: un Manager poate avea subordonați (alți manageri sau
// angajați simpli), iar un Angajat simplu nu are subordonați.

import clase.Angajat;
import clase.Manager;
import clase.Subordonat;

public class Main {
    public static void main(String[] args) {
        Angajat manager = new Manager("Ana");
        Angajat manager2 = new Manager("Sofia");
        Angajat subordonat = new Subordonat("Mihai");

        manager2.adaugaAngajat(manager);
        manager.adaugaAngajat(subordonat);

        manager2.afiseazaDetalii();
        subordonat.concediazaAngajat(manager);
    }
}