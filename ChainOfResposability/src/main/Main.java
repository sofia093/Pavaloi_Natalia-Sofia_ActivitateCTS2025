package main;

import clase.*;
//F16
public class Main {
    public static void main(String[] args) {
        Comanda comanda1 = new Comanda(100);
        Comanda comanda2 = new Comanda(90);

        Autobuz autobuz1 = new Autobuz1();
        Autobuz autobuz2 = new Autobuz2();
        Autobuz autobuz3 = new Autobuz3();

        autobuz1.setUrmAutobuz(autobuz2);
        autobuz2.setUrmAutobuz(autobuz3);

        autobuz1.anuntaComanda(comanda1);
        autobuz1.anuntaComanda(comanda2);
    }
}