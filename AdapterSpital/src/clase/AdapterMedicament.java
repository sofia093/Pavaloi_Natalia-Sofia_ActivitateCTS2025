package clase;

public class AdapterMedicament extends MedicamentSpital implements IMedicamentFarmacie{
    public AdapterMedicament(String nume, int pret) {
        super(nume, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
