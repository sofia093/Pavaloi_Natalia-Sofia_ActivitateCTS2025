package AdapterClase.clase;

public class MedicamentSpital {
    private float pret;
    private String nume;

    public MedicamentSpital(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public void achizitioneazaMedicamente(){
        prezintaReteta();
        System.out.println(new StringBuilder("A fost achizitionat la pretul de ").append(pret).append(" lei."));
    }

    public void prezintaReteta(){
        System.out.println("Este prezentata reteta pentru medicamentul "+nume);
    }
}
