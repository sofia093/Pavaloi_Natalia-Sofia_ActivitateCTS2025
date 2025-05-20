package main;

import clase.AdapterMedicament;
import clase.Farmacie;
import clase.IMedicamentFarmacie;
import clase.MedicamentFarmacie;

//A5
public class Main {
    public static void main(String[] args) {
        IMedicamentFarmacie medicament = new MedicamentFarmacie("Nurofen", 20);
        AdapterMedicament medicament1 = new AdapterMedicament("Antibiotic", 57);

        Farmacie farmacie = new Farmacie();
        farmacie.vindeMedicament(medicament);
        farmacie.vindeMedicament(medicament1);

    }
}