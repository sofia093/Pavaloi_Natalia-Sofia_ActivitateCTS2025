package main;

import clase.Autobuz;
import clase.AutobuzProxy;
import clase.Client;
import clase.IAutobuz;

//F8
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(100);
        IAutobuz autobuzNoapte = new AutobuzProxy(autobuz);

        autobuz.afiseazaInformatii();
        autobuzNoapte.afiseazaInformatii();

    }
}