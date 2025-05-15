package main;

import clase.Card;
import clase.Cash;
import clase.Client;
import clase.IMetodaPlata;

//A11
public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Iulia", new Card());

        client1.platesteChitanta();

        IMetodaPlata metodaPlataCash = new Cash(20);
        client1.setMetodaPlata(metodaPlataCash);

        client1.platesteChitanta();

    }
}