package main;

import clase.Calator;
import clase.CardCalatorie;
import clase.IMetodaPlata;
import clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlataCardCalatorie = new CardCalatorie(3);

        Calator calator1= new Calator("Sonia", metodaPlataCardCalatorie);
        calator1.platesteBilet(5);
        calator1.setMetodaPlata(new PlataSMS());
        calator1.platesteBilet(5);
        calator1.setMetodaPlata(metodaPlataCardCalatorie);
        calator1.platesteBilet(5);

    }
}