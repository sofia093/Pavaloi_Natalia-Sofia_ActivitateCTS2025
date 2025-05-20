package Factories;

import clase.Mancare;

public interface FactoryMancare {
    Mancare createMancare(TipMancare tipMancare, String nume, double pret);
}
