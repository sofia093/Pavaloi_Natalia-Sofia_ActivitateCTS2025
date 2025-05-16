package main;

import clase.AutobuzFactory;
import clase.Linie;

//F9
public class Main {
    public static void main(String[] args) throws Exception {
        AutobuzFactory factory = new AutobuzFactory();

        Linie linie = new Linie(100, "Piata Romana", "Tei");

        factory.getAutobuzeV1("Mercedes", 2020, 36).afizeazaInformatii(linie);
        factory.getAutobuzeV2("Mercedes").afizeazaInformatii(linie);

    }
}