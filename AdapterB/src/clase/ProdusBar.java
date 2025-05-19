package clase;

public class ProdusBar {
    private String nume;
    private double pret;

    public ProdusBar(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }


    public void printeazaFacturaBar(){
        System.out.println("Factura Bar: " + nume + " - " + pret);
    }

}
