package main;

import clase.AdapterBar;
import clase.Bucatarie;
import clase.IProdusBucatarie;
import clase.ProdusBucatarie;

//B5
public class Main {
    public static void main(String[] args) {
        IProdusBucatarie produsBucatarie = new ProdusBucatarie("Mici", 3, 4);
        produsBucatarie.printeazaFactura();

        AdapterBar produsBar = new AdapterBar("Limonada", 15);
        produsBar.printeazaFactura();

        Bucatarie bucatarie = new Bucatarie();
        bucatarie.aduceNota(produsBucatarie);
        bucatarie.aduceNota(produsBar);

    }
}