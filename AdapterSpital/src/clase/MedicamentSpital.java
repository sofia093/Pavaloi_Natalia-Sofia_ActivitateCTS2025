package clase;

public class MedicamentSpital {
    private String nume;
    private int pret;

    public MedicamentSpital(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("S-a achizitionat medicamentul " + nume + " la pretul de " + pret + " lei");
    }

    void prezintaReteta(){
        System.out.println("Se prezinta reteta.");
    }
}
