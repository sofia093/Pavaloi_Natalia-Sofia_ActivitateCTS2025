package Clase;

public class Rezervare extends ARezervare{

    public Rezervare() {
        super();
    }

    public Rezervare(String nume, int i, String s, String s1) {
    }


    @Override
    public void descriere() {
        System.out.println("Rezervare.");
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervare = new Rezervare();
        rezervare.numeClient=this.numeClient;
        rezervare.nrPersoane=this.nrPersoane;
        rezervare.data=this.data;
        rezervare.ora=this.ora;
        return rezervare;
    }
}
