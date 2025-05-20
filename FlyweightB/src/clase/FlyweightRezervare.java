package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRezervare {
    private Map<String, IClient> flyweight;

    public FlyweightRezervare() {
        this.flyweight = new HashMap<String, IClient>();
    }

    public IClient getFlyweight(String nume) {
        if(flyweight.containsKey(nume)) {
            return flyweight.get(nume);
        }
        throw new RuntimeException("Flyweight not found");
    }

    public IClient getFlyweightV2(String numeClient, String nrTelefon) {
        if(flyweight.containsKey(numeClient)) {
            return flyweight.get(numeClient);
        }
        flyweight.put(numeClient,new Client(numeClient, nrTelefon));
        return flyweight.get(numeClient);

    }

}
