package Clase;

public class MedicamentFarmacie {
    private float pret;
    private String nume;
    private boolean esteInStoc;

    public MedicamentFarmacie(float pret, String nume, boolean esteInStoc) {
        this.pret = pret;
        this.nume = nume;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicamente(){
        if(this.esteInStoc) {
            System.out.println(new StringBuilder("Medicamentul ").append(nume).append(" a fost achizitionat la pretul de ").append(pret).append(" lei."));
        }else{
            System.out.println(new StringBuilder("Medicamentul ").append(nume).append(" nu este in stoc."));
        }
    }
}
