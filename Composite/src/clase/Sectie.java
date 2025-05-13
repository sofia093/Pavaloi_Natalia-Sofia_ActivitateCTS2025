package clase;

public class Sectie implements IStructura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectia: " + this.nume);
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        throw new Exception("Not implemented.");
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        throw new Exception("Nu poate sterge un nod.");
    }

    @Override
    public IStructura getNodCopil(int index) throws Exception {
        throw new Exception("Not implemented.");
    }

}
