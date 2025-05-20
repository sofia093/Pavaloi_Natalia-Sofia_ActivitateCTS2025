package main;

import clase.ARezervare;
import clase.Rezervare;
import clase.Supa;
import Factory.Factory;
import Factory.TipSupe;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(250, 10);

        Supa supa1 = factory.createSupa(TipSupe.LEGUME,"Legume",2);
        supa1.preparareSupa();
        Supa supa2 = factory.createSupa(TipSupe.VITA,"Vita", 5);
        supa2.preparareSupa();
        Supa supa3 = factory.createSupa(TipSupe.CIUPERCI,"Ciuperci", 25);
        supa3.preparareSupa();

        ARezervare rezervare = new Rezervare("Sofia", 4, "23/04/25", "12.00");

        ARezervare rezervare1=rezervare.copiaza();
        ARezervare rezervare2=rezervare.copiaza();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

    }
}