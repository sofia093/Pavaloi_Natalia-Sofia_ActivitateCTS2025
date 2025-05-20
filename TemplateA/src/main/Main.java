package main;

import clase.AInternare;
import clase.Internare;
import clase.InternareUrgenta;

//A14
public class Main {
    public static void main(String[] args) {
        AInternare internare = new Internare();
        AInternare internareUrgente = new InternareUrgenta(3);

        internare.internare();
        internareUrgente.internare();
    }
}