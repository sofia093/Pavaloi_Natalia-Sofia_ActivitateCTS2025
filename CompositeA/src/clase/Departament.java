package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament extends ADepartament{
    private List<ADepartament> sectii;
    private String nume;

    public Departament(String nume) {
        this.nume = nume;
        this.sectii = new ArrayList<>();
    }

    @Override
    public void afisareInfo() throws Exception {
        System.out.println(nume + " are sectiile: ");
        for(ADepartament s : sectii) {
            s.afisareInfo();
        }
    }

    @Override
    public void adaugaNod(ADepartament structura) throws Exception {
        sectii.add(structura);
    }

    @Override
    public void stergeNod(ADepartament structura) throws Exception {
        sectii.remove(structura);
    }

    @Override
    public ADepartament getNodCopil(int index) throws Exception {
        return sectii.get(index);
    }

}
