package main;

import clase.Observer;
import clase.Pacient;
import clase.STB.Autobuz;
import clase.STB.Client;
import clase.STB.MijlocTransport;
import clase.STB.Tramvai;
import clase.Spital;

//A12
public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital("Universitar");

        Observer pacient1 = new Pacient("Marta");
        Observer pacient2 = new Pacient("Mihai");

        spital.adaugaObserver(pacient1);
        spital.adaugaObserver(pacient2);

        spital.anuntaUrgenta();

        spital.stergeObserver(pacient1);
        spital.anuntaVirus();

        MijlocTransport autobuz = new Autobuz(100);
        MijlocTransport tramvai = new Tramvai(32);

        Observer client1=new Client("Andrei");
        Observer client2=new Client("Sofia");

        autobuz.adaugaObserver(client1);
        autobuz.adaugaObserver(client2);

        autobuz.pleacaDinStatie();
        autobuz.stergeObserver(client1);
        autobuz.schimbaRuta("Piata Victoriei");


        tramvai.adaugaObserver(client1);
        tramvai.pleacaDinStatie();

    }
}