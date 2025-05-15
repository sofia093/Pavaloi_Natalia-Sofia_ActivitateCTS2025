package main;


import clase.Autobuz;
import clase.Metrou;
import clase.MijlocTransport;
import clase.Tramvai;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz();
        MijlocTransport tramvai = new Tramvai();
        MijlocTransport metrou = new Metrou();

        autobuz.setUrmMijloc(tramvai);
        tramvai.setUrmMijloc(metrou);

        autobuz.anuntaCalator(4);

    }
}