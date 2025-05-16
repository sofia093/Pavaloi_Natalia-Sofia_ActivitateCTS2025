package clase;

public class Autobuz implements IStructura {
    private String model;
    private int nrLocuri;

    public Autobuz(String model, int nrLocuri) {
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public Autobuz(String model) {
        this.model = model;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Autobuzul " + model + " cu " + nrLocuri + " locuri");
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        throw new Exception("Nu poate adauga nodul");
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        throw new Exception("Nu poate sterge nodul");
    }

    @Override
    public IStructura getNod(int index) throws Exception {
        throw new Exception("Nu poate returna nodul");
    }
}
