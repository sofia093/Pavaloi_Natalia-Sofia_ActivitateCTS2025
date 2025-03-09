package Clase;

import Interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    public String getIdAsistent() {
        return idAsistent;
    }

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public void preda(){

    }

}
