package AdapterClase.clase;

import clase.MedicamentFarmacie;

public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia noastra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicamente();
    }
}
