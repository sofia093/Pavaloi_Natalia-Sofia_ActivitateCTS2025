package Clase;

import Interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;

    public String getIdAngajat() {
        return idAngajat;
    }

    public Profesor(String nume, int varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    public void preda() {

    }
}
