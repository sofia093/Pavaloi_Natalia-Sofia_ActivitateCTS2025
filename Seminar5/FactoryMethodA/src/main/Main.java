package main;

import clase.Angajat;
import Factories.FactoryPersonalMedical;
import Factories.FactoryPersonalNonMedical;
import Factories.TipPersonalMedical;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical factoryMedical = new FactoryPersonalMedical(10);
        FactoryPersonalNonMedical factoryNonMedical = new FactoryPersonalNonMedical(2);

        Angajat medic = factoryMedical.create(TipPersonalMedical.MEDIC,"Marcel", 5000);

    }
}