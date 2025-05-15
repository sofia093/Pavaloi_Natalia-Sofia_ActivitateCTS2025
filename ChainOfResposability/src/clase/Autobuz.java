package clase;

public abstract class Autobuz {
    private Autobuz urmAutobuz;
    protected boolean disponibil = true;

    public boolean isDisponibil() {
        return disponibil;
    }

    public void devineDisponibil(){
        this.disponibil=true;
    }

    public void devineOcupat(){
        this.disponibil=false;
    }

    public Autobuz getUrmAutobuz() {
        return urmAutobuz;
    }

    public void setUrmAutobuz(Autobuz urmAutobuz) {
        this.urmAutobuz = urmAutobuz;
    }

    public abstract void anuntaComanda(Comanda comanda);
}
