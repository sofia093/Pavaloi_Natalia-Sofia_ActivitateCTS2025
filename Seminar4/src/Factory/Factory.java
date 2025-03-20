package Factory;

import Clase.Supa;
import Clase.SupaCiuperci;
import Clase.SupaLegume;
import Clase.SupaVita;

public class Factory {
    private int gramaj;
    private double pretPeSuta;

    public Factory(int gramaj, double pretPeSuta) {
        this.gramaj = gramaj;
        this.pretPeSuta = pretPeSuta;
    }

    public Supa getSupa(TipSupe tipSupe, String ingrediente, double extraSupa) {
        switch (tipSupe) {
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(200, pretPeSuta, ingrediente, extraSupa);
                return supaLegume;
            case CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(200, pretPeSuta, ingrediente, extraSupa);
                return supaCiuperci;
            case VITA :
                SupaVita supaVita = new SupaVita(250, pretPeSuta, ingrediente, extraSupa);
                return supaVita;
            default: return null;
        }
    }
}
