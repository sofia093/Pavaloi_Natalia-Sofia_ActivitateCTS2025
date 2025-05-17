package main;

import clase.ADepartament;
import clase.Departament;
import clase.Sectie;

//A8
public class Main {
    public static void main(String[] args) throws Exception {
        ADepartament departament = new Departament("Dep1");
        ADepartament sectia1 = new Sectie("Chirurgie");
        ADepartament sectia2 = new Sectie("Generala");

        departament.adaugaNod(sectia1);
        departament.adaugaNod(sectia2);

        departament.afisareInfo();

        departament.stergeNod(sectia1);

        departament.getNodCopil(0).afisareInfo();

        sectia1.afisareInfo();

    }
}