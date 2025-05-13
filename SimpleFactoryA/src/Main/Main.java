package Main;

import Clase.Angajat;
import Clase.Factory;
import Clase.TipPersonal;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(0.2);
        Angajat medic= factory.createAngajat(TipPersonal.Medic, "Ana", 4000);
        System.out.println(medic.toString());
    }
}