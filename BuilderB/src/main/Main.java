package main;

import clase.Rezervare;
import clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezBuilder = new RezervareBuilder();
        rezBuilder.setScauneErgonomice(true);
        Rezervare rez1= rezBuilder.setNumeClient("Ana").build();
        System.out.println(rez1.toString());

        Rezervare rez2= new RezervareBuilder().setNumeClient("Vasi").setDecorareaMesei(true).build();
        System.out.println(rez2.toString());
    }
}