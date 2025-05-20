package main;

import clase.AdaptorBilet;
import clase.BiletMetrou;
import clase.ControlBilet;
import clase.IBiletMetrou;

//F4
public class Main {
    public static void main(String[] args) {
        IBiletMetrou bilet = new BiletMetrou(0);
        AdaptorBilet biletTerestru = new AdaptorBilet(3);

        bilet.validareBilet();
        biletTerestru.validareBilet();

        ControlBilet controlBilet = new ControlBilet();
        controlBilet.verificaBilet(bilet);
        controlBilet.verificaBilet(biletTerestru);
    }
}