package clase;

import java.util.HashMap;
import java.util.Map;

public class AutobuzFactory {
    private Map<String, IAutobuz> autobuze;

    public AutobuzFactory() {
        this.autobuze = new HashMap<String, IAutobuz>();
    }

    public IAutobuz getAutobuzeV1(String model, int anFabricatie, int nrLocuri) {
        if(!autobuze.containsKey(model)){
            autobuze.put(model,new Autobuz(model, anFabricatie, nrLocuri));
        }
        return autobuze.get(model);
    }

    public IAutobuz getAutobuzeV2(String model) throws Exception {
        if (autobuze.containsKey(model)) {
            return autobuze.get(model);
        } else {
            throw new Exception("error");
        }
    }
}
