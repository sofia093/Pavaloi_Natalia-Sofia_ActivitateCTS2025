package main;

//Banca oferă mai multe posibilități de returnare anticipată a unui credit: cu reducerea ratei
// sau cu reducerea perioadei. Clasa abstractă AbstractCreditConditions specifică detaliile ce
// vor fi returnate în urma unei simulări de returnare anticipată. Utilizați un design pattern
// ce ajută bancă să permită utilizatorilor să realizeze diverse simulări de returnare anticipată
// specificând suma de bani ce va fi returnată anticipat. Fiecare 500 u.m. returnate anticipat
// vor reduce rata cu 50 u.m. pentru o simulare cu reducerea ratei sau cu 1 lună durata de
// rambursare pentru reducerea perioadei. Luați în considerare și faptul că pot apărea în viitor
// noi modalități de returnare anticipată.

import clase.Client;
import clase.Reducere;
import clase.ReducereaPerioadei;
import clase.ReducereaRatei;

public class Main {
    public static void main(String[] args) {
        Reducere reducereRata = new ReducereaRatei();
        reducereRata.setRate(2);
        Reducere reducerePerioadei = new ReducereaPerioadei();
        reducerePerioadei.setDurationInMonths(5);

        Client client = new Client("Ana");
        client.setMetodaReducere(reducereRata);
        client.returneazaAnticipat(200);

        client.setMetodaReducere(reducerePerioadei);
        client.returneazaAnticipat(600);
    }
}