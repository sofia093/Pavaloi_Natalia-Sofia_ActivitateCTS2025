package AdapterClase.Main;

import AdapterClase.clase.Farmacie;
import AdapterClase.clase.IMedicamentFarmacie;
import AdapterClase.clase.MedicamentFarmacie;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Farmacia");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100, "Paduden", true);
    }
}
