package Clase;

public class Adapter extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public Adapter(float pret, String nume, boolean esteInStoc) {
        super(pret, nume, esteInStoc);
    }

    public Adapter(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getPret(), medicamentSpital.getNume(), true);
        this.medicamentSpital=medicamentSpital;
    }

    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicamente();
    }
}
