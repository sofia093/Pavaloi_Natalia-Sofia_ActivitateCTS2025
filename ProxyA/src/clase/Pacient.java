package clase;

public class Pacient {
    private String nume;
    private boolean areAsigurare;

    public Pacient(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", areAsigurare=").append(areAsigurare);
        sb.append('}');
        return sb.toString();
    }
}
