package Factories;

import clase.Angajat;

public interface FactoryPersonal {
    Angajat create(TipPersonal tipPersonal, String nume, double salariu);
}
