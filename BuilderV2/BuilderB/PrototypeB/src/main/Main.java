package main;

import clase.AContClient;
import clase.ContClient;

public class Main {
    public static void main(String[] args) {
        AContClient cont = new ContClient("Ana", "23.07.2024");
        AContClient cont1 = cont.clone();

        System.out.println(cont1);
        System.out.println(cont);

    }
}