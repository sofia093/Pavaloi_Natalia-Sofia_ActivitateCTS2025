package clase;

public class MedicamentSpital {
    private String nume;
    private float pret;

    public MedicamentSpital(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Ai cumparat medicamentul "+nume+ " la pretul de " + pret +" lei");
    }

    public void  prezintaReteta(){
        System.out.println("Prezinta reteta pentru medicamentul "+nume);
    }
}
