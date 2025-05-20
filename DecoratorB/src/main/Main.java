package main;

import clase.DecoratorLMA;
import clase.DecoratorNota;
import clase.INotaDePlata;
import clase.NotaDePlata;

//B7
public class Main {
    public static void main(String[] args) {
        INotaDePlata notaDePlata = new NotaDePlata();
        notaDePlata.trimiteNota();

        DecoratorNota notaLMA = new DecoratorLMA(notaDePlata);
        notaLMA.trimiteMesaj();


    }
}