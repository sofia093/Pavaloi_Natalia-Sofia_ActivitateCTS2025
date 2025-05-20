package main;

import clase.AMeniu;
import clase.Item;
import clase.Sectiune;

//B8
public class Main {
    public static void main(String[] args) throws Exception {
        AMeniu sectiune = new Sectiune("Bauturi");
        AMeniu item1 = new Item("Cola");
        AMeniu item2 = new Item("Limonada");

        sectiune.adaugaNod(item1);
        sectiune.adaugaNod(item2);

        sectiune.descrie();
        sectiune.stergeNod(item1);
        sectiune.descrie();
        sectiune.getNodCopil(0).descrie();

    }
}