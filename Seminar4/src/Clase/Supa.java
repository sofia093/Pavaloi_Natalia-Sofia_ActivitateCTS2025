package Clase;

public abstract class Supa {
    private int gramaj;
    private double pretPeSuta;
    private String ingrediente;

    public Supa(int gramaj, double pretPeSuta, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPeSuta = pretPeSuta;
        this.ingrediente = ingrediente;
    }

    public int getGramaj() {
        return gramaj;
    }

    public double getPretPeSuta() {
        return pretPeSuta;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public abstract void preparareSupa(); //afiseazaSupa

    public double calculeazaPret(){
        return pretPeSuta * gramaj / 100;
    };
}
