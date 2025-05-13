package main;

import clase.Departament;
import clase.IStructura;
import clase.Sectie;

//A8
public class Main {
    public static void main(String[] args) throws Exception {
        IStructura departament1= new Departament("Chirurgie");
        IStructura sectie1=new Sectie("sectia1");
        IStructura sectie2=new Sectie("sectia2");

        departament1.adaugaNod(sectie1);
        departament1.adaugaNod(sectie2);
        departament1.descriereStructura();

        departament1.stergeNod(sectie1);
        departament1.descriereStructura();

        IStructura sectie3=departament1.getNodCopil(0);
        sectie3.descriereStructura();
        }


    }
