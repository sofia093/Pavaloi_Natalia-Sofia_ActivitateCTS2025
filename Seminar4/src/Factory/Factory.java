package Factory;

import clase.Supa;
import clase.SupaCiuperci;
import clase.SupaLegume;
import clase.SupaVita;

public class Factory {
    private int gramaj;
    private double pretPeSuta;

    public Factory(int gramaj, double pretPeSuta) {
        this.gramaj = gramaj;
        this.pretPeSuta = pretPeSuta;
    }

    public Supa createSupa(TipSupe tipSupe, String ingrediente, double extraSupa) {
        switch (tipSupe) {
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(gramaj, pretPeSuta, ingrediente, extraSupa);
                return supaLegume;
            case CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(gramaj, pretPeSuta, ingrediente, extraSupa);
                return supaCiuperci;
            case VITA :
                SupaVita supaVita = new SupaVita(gramaj, pretPeSuta, ingrediente, extraSupa);
                return supaVita;
            default: return null;
        }
    }
}
