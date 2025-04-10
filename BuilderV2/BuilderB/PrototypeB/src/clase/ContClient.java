package clase;

public class ContClient extends AContClient{
    public ContClient() {
    }

    public ContClient(String nume, String data) {
        super(nume, data);
    }

    @Override
    public AContClient clone() {
        ContClient c = new ContClient();
        c.nume = this.nume;
        c.data = this.data;
        return c;
    }
}
