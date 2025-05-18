package main;

import clase.ISpital;
import clase.Pacient;
import clase.ProxySpital;
import clase.Spital;

//A9
public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Mihai", true);
        ISpital spital = new Spital(pacient);
        ISpital proxySpital = new ProxySpital(pacient);
        ISpital proxySpital2 = new ProxySpital((Spital)spital);

        spital.afiseazaDetalii();
        spital.interneaza();

        proxySpital.afiseazaDetalii();
        proxySpital.interneaza();

        proxySpital2.interneaza();

    }
}