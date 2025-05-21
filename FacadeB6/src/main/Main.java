package main;

import clase.Facade;
import clase.Masa;

//B6
public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(2, true, false);

        Facade facade = new Facade();

        facade.verificaMasa(masa);

    }
}