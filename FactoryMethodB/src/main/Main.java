package main;

import clase.Mancare;
import Factories.FactoryDesert;
import Factories.FactorySupa;
import Factories.TipDesert;

public class Main {
    public static void main(String[] args) {
        FactoryDesert factoryDesert = new FactoryDesert("Ciocolata");
        FactorySupa factorySupa = new FactorySupa(200);

        Mancare clatite= factoryDesert.createMancare(TipDesert.Clatite, "clasice", 15);
        factoryDesert.setSos("Nutella");
        System.out.println(clatite.toString());
    }
}