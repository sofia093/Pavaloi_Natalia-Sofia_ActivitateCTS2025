package clase;

public class Secretar extends Angajat{
    private double vechime;

    public Secretar(String nume, double salariu, double vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append("vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
