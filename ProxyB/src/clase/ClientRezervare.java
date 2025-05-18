package clase;

public class ClientRezervare {
    private String nume;
    private int nrPersoane;
    private String ora;

    public ClientRezervare(String nume, int nrPersoane, String ora) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    public String getNume() {
        return nume;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getOra() {
        return ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientRezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
