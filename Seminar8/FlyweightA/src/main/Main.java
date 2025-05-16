package main;

import clase.PacientFactory;
import clase.Spitalizare;

//A10
public class Main {
    public static void main(String[] args) throws Exception {
        PacientFactory pacientFactory = new PacientFactory();

        Spitalizare spitalizare1= new Spitalizare(2,3,5);
        Spitalizare spitalizare2= new Spitalizare(3,4,6);


        pacientFactory.getPacientV1("Mihai", "07543456", "Bd Liberatii 12");

        pacientFactory.getPacientV2("Mihai").afiseazaInformatii(spitalizare1);

        pacientFactory.getPacientV1("Anie", "075432345","str. Mihai Viteazu 10").afiseazaInformatii(spitalizare2);
    }
}