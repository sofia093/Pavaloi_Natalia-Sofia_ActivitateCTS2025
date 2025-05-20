package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends AMeniu{
    private List<AMeniu> itemi;
    private String nume;

    public Sectiune(String nume) {
        this.itemi = new ArrayList<AMeniu>();
        this.nume = nume;
    }

    @Override
    public void descrie() {
        System.out.println("Sectiunea " + nume + " are itemii: ");
        for (AMeniu item : itemi) {
            item.descrie();
        }
    }

    @Override
    public void adaugaNod(AMeniu item) throws Exception {
        itemi.add(item);
    }

    @Override
    public void stergeNod(AMeniu item) throws Exception {
        itemi.remove(item);
    }

    @Override
    public AMeniu getNodCopil(int index) throws Exception {
        return itemi.get(index);
    }
}
