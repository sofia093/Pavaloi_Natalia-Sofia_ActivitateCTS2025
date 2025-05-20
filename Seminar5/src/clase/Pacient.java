package clase;

public class Pacient {
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;
    private String numeInsotior;

    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejun, boolean arePapuci, boolean areHalat, String numeInsotior) {
        this.numePacient = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
        this.numeInsotior = numeInsotior;
    }

    protected void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    protected void setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    protected void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    protected void setNumeInsotior(String numeInsotior) {
        this.numeInsotior = numeInsotior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append(", arePapuci=").append(arePapuci);
        sb.append(", areHalat=").append(areHalat);
        sb.append(", numeInsotior='").append(numeInsotior).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
