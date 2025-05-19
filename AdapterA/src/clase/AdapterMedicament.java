package clase;

public class AdapterMedicament extends MedicamentSpital implements IMedicamentFarmacie  {

    public AdapterMedicament(String nume, float pret) {
        super(nume, pret); //datele introduse in Adapter se duc in constructorul Spital
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament(); // se refera la clasa Spital
    }                                     // se apeleaza metoda din target pentru obiectul din adaptee
}
