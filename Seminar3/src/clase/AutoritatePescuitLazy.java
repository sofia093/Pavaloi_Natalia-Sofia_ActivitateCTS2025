package clase;

public class AutoritatePescuitLazy {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutoritatiEmise;

    private static AutoritatePescuitLazy instanta=null;

    private AutoritatePescuitLazy(String denumire, String website, int nrAngajati, int nrAutoritatiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutoritatiEmise = nrAutoritatiEmise;
    }

    public static synchronized AutoritatePescuitLazy getInstanta(String denumire, String website, int nrAngajati, int nrAutoritatiEmise) {
        if(instanta == null) {
            instanta = new AutoritatePescuitLazy(denumire, website, nrAngajati, nrAutoritatiEmise);
            // Clase.AutoritatePescuitLazy instanta = new Clase.AutoritatePescuitLazy("ANPA", "www.anpa.ro", 3, 3);
            // => gresit pt ca trebuie sa refolosim singura instanta creata mai sus
            // cum merg threadurile?

        }
        return instanta;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getWebsite() {
        return website;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public int getNrAutoritatiEmise() {
        return nrAutoritatiEmise;
    }

    void angajeaza(int nr){
        this.nrAngajati += nr;
    }

    void concediaza(int n){
        this.nrAngajati -= n;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public void setNrAutoritatiEmise(int nrAutoritatiEmise) {
        this.nrAutoritatiEmise = nrAutoritatiEmise;
    }

    public static void setInstanta(AutoritatePescuitLazy instanta) {
        AutoritatePescuitLazy.instanta = instanta;
    }

    public void setAutorizatie(String numePersoana){
        System.out.println(numePersoana);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateLazy{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutoritatiEmise);
        sb.append('}');
        return sb.toString();
    }

    public void emiteAutorizatie(String numePersoana){
        System.out.println("S-a emis o autorizatie pentru"+numePersoana);
        this.nrAutoritatiEmise++;
    }
}
