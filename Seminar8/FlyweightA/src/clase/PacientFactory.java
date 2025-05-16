package clase;

import java.util.HashMap;
import java.util.Map;

public class PacientFactory {
    Map<String, IPacient> pacienti;

    public PacientFactory() {
        this.pacienti = new HashMap<String, IPacient>();
    }

    public IPacient getPacientV2(String nume) throws Exception{
        if(pacienti.containsKey(nume)) {
            return pacienti.get(nume);
        }else{
            throw new Exception("Errore");
        }
    }

    public IPacient getPacientV1(String nume, String nrTelefon, String adresa){
        if(!pacienti.containsKey(nume)) {
            IPacient pacient = new Pacient(nume, nrTelefon, adresa);
            pacienti.put(nume, pacient);
        }
        return pacienti.get(nume);
    }
}