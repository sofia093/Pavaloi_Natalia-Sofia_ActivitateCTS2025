package main;

import clase.Angajat;
import clase.Factory;
import clase.TipPersonal;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(0.2);
        Angajat medic= factory.createAngajat(TipPersonal.Medic, "Ana", 4000);
        System.out.println(medic.toString());
    }
}