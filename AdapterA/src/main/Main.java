package main;

import clase.AdapterMedicament;
import clase.Farmacie;
import clase.IMedicamentFarmacie;
import clase.MedicamentFarmacie;

//A5
public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Farmacie");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Nurofen", 30);
        medicamentFarmacie.cumparaMedicament();
        farmacie.vindeMedicament(medicamentFarmacie);

        AdapterMedicament medicamentSpital = new AdapterMedicament("Antibiotic", 100);
        medicamentSpital.cumparaMedicament();
        farmacie.vindeMedicament(medicamentSpital);

    }
}