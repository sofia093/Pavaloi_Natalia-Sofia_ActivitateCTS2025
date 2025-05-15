package main;

import clase.AsezareMasa;
import clase.MasaColt;
import clase.MasaFereastra;

//B14
public class Main {
    public static void main(String[] args) {
        AsezareMasa chelner1 = new MasaColt("Anton");
        AsezareMasa chelner2 = new MasaFereastra("Andra");

        chelner1.aranjeazaMasa();
        chelner2.aranjeazaMasa();
    }
}