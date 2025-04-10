package clase;

public class Rezervare {
    private String numeClient;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;

    public Rezervare(String numeClient, boolean scauneErgonomice, boolean decorareaMesei) {
        this.numeClient = numeClient;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareaMesei=").append(decorareaMesei);
        sb.append('}');
        return sb.toString();
    }
}
