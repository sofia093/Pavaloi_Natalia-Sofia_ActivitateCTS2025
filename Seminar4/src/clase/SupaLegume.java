package clase;

public class SupaLegume extends Supa{
    private double cantitateCrutoane;

    public SupaLegume(int gramaj, double pretPeSuta, String ingrediente, double cantitateCrutoane) {
        super(gramaj, pretPeSuta, ingrediente);
        this.cantitateCrutoane = cantitateCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu "+cantitateCrutoane+" g de crutoane e gata.");
    }

    @Override
    public double calculeazaPret(){
        return super.calculeazaPret() + cantitateCrutoane / 100 * getPretPeSuta();
    }
}
