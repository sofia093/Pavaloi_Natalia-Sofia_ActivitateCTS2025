package clase;

public class SupaCiuperci extends Supa{
    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPeSuta, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPeSuta, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu "+cantitateCiuperci+" g de ciuperci e gata.");
    }

    @Override
    public double calculeazaPret(){
        return super.calculeazaPret() + cantitateCiuperci / 100 * getPretPeSuta();
    }
}
