package clase;

public class MedicamentFarmacie implements IMedicamentFarmacie {
    private String nume;
    private int pret;

    public MedicamentFarmacie(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("A fost cumparat medicamntul " + nume + " la pretul de " + pret + " lei");
    }
}
