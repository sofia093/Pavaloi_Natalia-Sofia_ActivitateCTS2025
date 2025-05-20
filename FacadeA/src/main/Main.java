package main;

import clase.Facade;
import clase.Pacient;
import clase.Pat;
import clase.Salon;

//A6
public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Maria", 3);
        Pacient pacient1 = new Pacient("Mihai", 1);

        Salon salon = new Salon();
        Pat pat1= new Pat(1,false);
        Pat pat2= new Pat(2,true);

        salon.adaugaPat(pat1);
        salon.adaugaPat(pat2);

        Facade facade = new Facade();
        facade.interneazaPacient(pacient, salon);

        pat2.setEsteLiber(false);
        facade.interneazaPacient(pacient1, salon);

        facade.interneazaPacient(pacient, salon);

    }
}