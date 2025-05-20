package clase;

public class Portar extends Angajat{
    private double vechime;

    public Portar(String nume, double salariu, double vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append("vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
