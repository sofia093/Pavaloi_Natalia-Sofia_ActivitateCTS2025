package main;

import clase.Card;
import clase.Client;
import clase.IModPlata;

//B11
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Dan");
        IModPlata card = new Card();
        client.setModPlata(card);
        client.plateste();
    }
}