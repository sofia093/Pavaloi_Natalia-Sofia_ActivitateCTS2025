package clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subiect {
    private List<Pacient> pacienti;

    public Spital() {
        this.pacienti = new ArrayList<Pacient>();
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        pacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        pacienti.remove(pacient);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Pacient pacient : pacienti) {
            pacient.primesteNotificare(mesaj);
        }
    }

    public void trimiteNotificareUrgenta() {
        trimiteNotificare("Se anunta o urgenta.");
    }

    public void trimiteNotificareVirus(String numeVirus){
        trimiteNotificare("Se anunta descoperirea virusului: " + numeVirus);
    }
}
