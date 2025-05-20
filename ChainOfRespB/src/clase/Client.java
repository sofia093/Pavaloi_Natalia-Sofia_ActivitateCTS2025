package clase;

public class Client {
    private String nume;
    private String nrTelefon;
    private String mail;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getMail() {
        return mail;
    }
}
