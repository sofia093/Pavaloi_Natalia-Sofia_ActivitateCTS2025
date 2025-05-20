package main;

import Builder.PachetTransport;
import Builder.PachetTransportBuilder;
import clase.Pacient;
import clase.PacientBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PachetTransport pt= new PachetTransportBuilder().setFumator(true).build();

        Pacient pacient= new PacientBuilder("Anton").arePapuci(true).buildPacient();

        PacientBuilder pacientBuilder=new PacientBuilder("George");
        Pacient pacient1=pacientBuilder.areInsotitor("Pavel").buildPacient();
        Pacient pacient2=pacientBuilder.arePapuci(true).buildPacient();

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());

    }
}