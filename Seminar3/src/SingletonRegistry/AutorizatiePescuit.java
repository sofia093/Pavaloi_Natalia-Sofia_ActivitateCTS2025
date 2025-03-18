package SingletonRegistry;

import java.util.Date;
import java.util.Map;

public class AutorizatiePescuit {
    private String denumire;
    private String website;
    private int nrAngajati;

    private static Map<String,Autorizatie> registry;

    private static AutorizatiePescuit instance = null;

    private AutorizatiePescuit(String website, String denumire, int nrAngajati, Map<String, Autorizatie> registru) {
        this.website = website;
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
        this.registry = registru;
    }

    public static synchronized AutorizatiePescuit getInstance(String website, String denumire, int nrAngajati, Map<String, Autorizatie> registru) {
        if(instance == null) {
            instance = new AutorizatiePescuit(website, denumire, nrAngajati, registru);
        }
        return instance;
    }

    public Autorizatie emiteAutorizatie(String numePersoana) {
        if (!registry.containsKey(numePersoana)) {
            registry.put(numePersoana, new Autorizatie(numePersoana, new Date().toString(), (registry.size() + 1)));
        }
        return registry.get(numePersoana);
    }

}
