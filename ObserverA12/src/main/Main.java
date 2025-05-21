package main;

import clase.Pacient;
import clase.Spital;
import clase.Subiect;

//A12
public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ana");
        Pacient pacient1 = new Pacient("Mihai");

        Spital spital =new Spital();

        spital.aboneazaPacient(pacient);
        spital.aboneazaPacient(pacient1);

        spital.trimiteNotificareUrgenta();

        spital.dezaboneazaPacient(pacient);

        spital.trimiteNotificareVirus("Corona");
    }
}