package clase;

import java.util.ArrayList;
import java.util.List;

public class GrupMare implements IStructura {
    private String nume;
    protected int nrLocuri = 50;
    private List<IStructura> lista;

    public GrupMare(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<IStructura>();
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Grupul mare " + nume+" are: ");
        for(IStructura s : lista){
            s.afiseazaStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        if(structura instanceof Autobuz) {
            ((Autobuz)structura).setNrLocuri(nrLocuri);
        }
        lista.add(structura);
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        lista.remove(structura);
    }

    @Override
    public IStructura getNod(int index) throws Exception {
        return lista.get(index);
    }
}
