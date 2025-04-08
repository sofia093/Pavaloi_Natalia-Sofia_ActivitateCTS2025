package Factories;

import Clase.Angajat;

public interface FactoryPersonal {
    Angajat create(TipPersonal tipPersonal, String nume, double salariu);
}
