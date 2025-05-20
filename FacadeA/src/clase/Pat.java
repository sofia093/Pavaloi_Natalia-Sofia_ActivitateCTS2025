package clase;

public class Pat {
    private int nrPat;
    private boolean esteLiber;

    public Pat(int nrPat, boolean esteLiber) {
        this.nrPat = nrPat;
        this.esteLiber = esteLiber;
    }

    public boolean isEsteLiber() {
        return esteLiber;
    }

    public void setEsteLiber(boolean esteLiber) {
        this.esteLiber = esteLiber;
    }
}
