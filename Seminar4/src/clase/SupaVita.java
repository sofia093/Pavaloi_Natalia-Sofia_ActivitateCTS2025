package clase;

public class SupaVita extends Supa {
    private double pretExtra;

    public SupaVita(int gramaj, double pretPeSuta, String ingrediente, double pretExtra) {
        super(gramaj, pretPeSuta, ingrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita cu smantana de "+ pretExtra+" lei e gata.");
    }

    @Override
    public double calculeazaPret(){
        return super.calculeazaPret() + pretExtra;
    }
}
