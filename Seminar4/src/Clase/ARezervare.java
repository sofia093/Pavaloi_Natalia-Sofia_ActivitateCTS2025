package Clase;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        if(numeClient.length()>3) {
            this.numeClient = numeClient;
        }else{
            this.numeClient = "necunoscut";
        }
        if(nrPersoane>2) {
            this.nrPersoane = nrPersoane;
        }else{
            this.nrPersoane = 5;
        }
        if(data.length()==8) {
            this.data = data;
        }else{
            this.data = "00/00/00";
        }
        this.ora = ora;
    }

    public ARezervare() {
        this.numeClient = "numeClient";
        this.nrPersoane = 0;
        this.data = "data";
        this.ora = "ora";
    }

    public abstract void descriere();

    public abstract ARezervare copiaza();

    @Override
    public String toString() {
        return "ARezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", data='" + data + '\'' +
                ", ora='" + ora + '\'' +
                '}';
    }
}
