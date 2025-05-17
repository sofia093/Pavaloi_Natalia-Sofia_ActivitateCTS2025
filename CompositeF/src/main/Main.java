package main;

import clase.Autobuz;
import clase.GrupMare;
import clase.GrupMic;
import clase.IStructura;

//F6
public class Main {
    public static void main(String[] args) throws Exception {
        IStructura grupMare = new GrupMare("Maxibuze");
        IStructura grupMic = new GrupMic("Microbuze");

        IStructura autobuz1 = new Autobuz("maxibuz1");
        IStructura autobuz2 = new Autobuz("microbuz1");
        IStructura autobuz3 = new Autobuz("microbuz2");

        grupMare.adaugaNod(autobuz1);
        grupMic.adaugaNod(autobuz2);
        grupMic.adaugaNod(autobuz3);

        grupMare.afiseazaStructura();
        grupMic.afiseazaStructura();

        grupMic.stergeNod(autobuz2);
        grupMic.getNod(0).afiseazaStructura();

        autobuz2.getNod(0);

    }
}