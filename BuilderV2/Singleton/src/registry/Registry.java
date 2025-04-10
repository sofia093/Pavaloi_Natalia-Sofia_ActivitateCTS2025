package registry;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private String nume;
    private static Map<String, Registry> registry = new HashMap<>();

    private Registry(String nume) {
        this.nume = nume;
    }

    public static Registry getInstance(String nume) {
        if(!registry.containsKey(nume)){
            registry.put(nume, new Registry(nume));
        }
        return registry.get(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Registry{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
