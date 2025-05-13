package clase;

import builder.Builder;

public class RezervareBuilder implements Builder {
    private String numeClient;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;

    public RezervareBuilder() {
        this.scauneErgonomice = false;
        this.decorareaMesei = false;
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilder setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(this.numeClient, this.scauneErgonomice, this.decorareaMesei);
    }
}
