package main;

import clase.ClientRezervare;
import clase.IRezervare;
import clase.ProxyRezervare;
import clase.Rezervare;

//B9
public class Main {
    public static void main(String[] args) {
        ClientRezervare clientRezervare = new ClientRezervare("Ana", 3, "14.00");

        IRezervare iRezervare = new Rezervare(clientRezervare);
        iRezervare.rezervaMasa();

        Rezervare rezervare = new Rezervare(clientRezervare);
        rezervare.rezervaMasa();

        IRezervare iProxy = new ProxyRezervare(clientRezervare);
        iProxy.rezervaMasa();

        ProxyRezervare proxyRezervare = new ProxyRezervare(clientRezervare);
        proxyRezervare.rezervaMasa();

    }
}