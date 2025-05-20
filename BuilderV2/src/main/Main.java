package main;

import clase.Pacient;
import clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setNumeInsotior("Patricia").setArePapuci(true);
        Pacient pacient1=pacientBuilder.setNumePacient("Ana").build2();
        Pacient pacient2=pacientBuilder.setNumePacient("Vasile").build2();

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}