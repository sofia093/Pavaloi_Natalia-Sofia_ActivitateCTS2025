package main;

import clase.Client;
import clase.FlyweightRezervare;
import clase.IClient;
import clase.Masa;

//B10
public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(2, 4);
        FlyweightRezervare flyweight = new FlyweightRezervare();

        flyweight.getFlyweightV2("Ana","09876567").descrieRezervare(masa);
        flyweight.getFlyweight("Mara").descrieRezervare(masa);

    }
}