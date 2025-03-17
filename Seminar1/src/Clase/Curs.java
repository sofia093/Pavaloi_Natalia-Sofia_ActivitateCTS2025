package Clase;

import Interfete.IPersoana;
import Interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil cadruDidactic;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, IPredabil cadruDidactic, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
    }

    public Curs() {
        this.numeCurs = "CTS";
        this.credite = 5;
        this.cadruDidactic = new Profesor();
        this.studenti = new ArrayList<>();
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }


    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public IPredabil getCadruDidactic(){
        return cadruDidactic;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public void detaliiCurs(){
        System.out.println(String.format("La cursul %s cu %d puncte de credit, predat de %s participa %d studenti.\n", numeCurs, credite, ((IPersoana)cadruDidactic).getNume(), studenti.size()));
    }

}
