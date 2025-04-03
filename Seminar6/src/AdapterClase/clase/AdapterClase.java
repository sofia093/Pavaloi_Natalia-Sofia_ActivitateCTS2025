package AdapterClase.clase;

public class AdapterClase extends MedicamentSpital implements IMedicamentFarmacie{

    public AdapterClase(float pret, String nume) {
        super(pret, nume);
    }

    @Override
    public void cumparaMedicamente() {

    }
}
