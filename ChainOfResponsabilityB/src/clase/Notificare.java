package clase;

import java.util.List;

public abstract class Notificare {
    private Notificare urmNotificare;

    public Notificare getUrmNotificare() {
        return urmNotificare;
    }

    public void setUrmNotificare(Notificare urmNotificare) {
        this.urmNotificare = urmNotificare;
    }

    public abstract void notifica(Client client, String mesaj);
}
