package Factories;

import Clase.Mancare;

public interface FactoryMancare {
    Mancare createMancare(TipMancare tipMancare, String nume, double pret);
}
