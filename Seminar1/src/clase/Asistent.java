package clase;

import Interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;
    private float salariu;

    public String getIdAsistent() {
        return idAsistent;
    }

    public Asistent(String nume, int varsta, String idAsistent, float salariu) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.salariu = salariu;
    }

    public Asistent() {
        super("asistent", 23);
        this.idAsistent = "0";
        this.salariu = 0;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setIdAsistent(String idAsistent) {
        this.idAsistent = idAsistent;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public void preda(){
        System.out.println(String.format("Asistentul %s in varsta de %d de ani preda la seminar", getNume(), varsta));
    }

    @Override
    public float calculVenit() {
        return salariu;
    }

    @Override
    public String toString() {
        return "Asistent{" +
                "idAsistent='" + idAsistent + '\'' +
                ", salariu=" + salariu +
                ", varsta=" + varsta +
                '}';
    }
}
