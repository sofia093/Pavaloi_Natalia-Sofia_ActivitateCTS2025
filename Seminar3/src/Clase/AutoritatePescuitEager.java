package Clase;

public class AutoritatePescuitEager {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritatePescuitEager instanta = new AutoritatePescuitEager("ANPA", "www.anpa.ro", 3, 3);

    private AutoritatePescuitEager(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static AutoritatePescuitEager getInstanta() {
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

    public int getNrAutorizatiiEmise() {
        return nrAutorizatiiEmise;
    }

    void angajeaza(int nr){
        this.nrAngajati += nr;
    }

    public void concediaza(int n){
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

    public void setNrAutorizatiiEmise(int nrAutorizatiiEmise) {
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static void setInstanta(AutoritatePescuitEager instanta) {AutoritatePescuitEager.instanta = instanta;
    }

    public void setAutorizatie(String numePersoana){
        System.out.println(numePersoana);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitEager{");
        sb.append("Clase.AutoritatePescuitEager{ denumire=")
                .append(denumire).append(", website='")
                .append(website).append("', nrAngajati=")
                .append(nrAngajati).append(", nrAutorizatiiEmise=")
                .append(nrAutorizatiiEmise).append("}");
        return sb.toString();
    }

    public void emiteAutorizatie(String numePersoana) {
        System.out.println("S-a emis o autorizatie pentru " + numePersoana);
        this.nrAutorizatiiEmise++;
    }

}
