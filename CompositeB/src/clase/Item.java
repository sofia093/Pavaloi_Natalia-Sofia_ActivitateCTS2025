package clase;

public class Item extends AMeniu{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void descrie() {
        System.out.println(nume);
    }

    @Override
    public void adaugaNod(AMeniu item) throws Exception {
        throw new Exception("Nu putem adauga nod.");
    }

    @Override
    public void stergeNod(AMeniu item) throws Exception {
        throw new Exception("Nu putem sterge nod.");
    }

    @Override
    public AMeniu getNodCopil(int index) throws Exception {
        throw new Exception("Nu are subsectiuni.");
    }
}
