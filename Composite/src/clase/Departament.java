package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura {
    private String nume;
    private List<IStructura> lista;

    public Departament(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<IStructura>();
    }

    @Override
    public void descriereStructura() throws Exception{
        System.out.println("Departament: " + nume + " are urmatoarele sectii: ");
        for (IStructura s : lista) {
            s.descriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        lista.add(structura);
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        lista.remove(structura);
    }

    @Override
    public IStructura getNodCopil(int index) throws Exception {
        return lista.get(index);
    }

}
