package clase;

public class Farmacie {
    public void vindeMedicament(IMedicamentFarmacie medicament) {
        System.out.println("Farmacia a vandut: ");
        medicament.cumparaMedicament();
    }
}
