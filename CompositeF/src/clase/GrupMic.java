package clase;

import java.util.ArrayList;
import java.util.List;

public class GrupMic implements IStructura{
    private String nume;
    protected int nrLocuri = 20;
    private List<IStructura> lista;

    public GrupMic(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<IStructura>();
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Grupul mic " + nume+" are: ");
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
