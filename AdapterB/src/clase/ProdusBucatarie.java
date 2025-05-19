package clase;

public class ProdusBucatarie implements IProdusBucatarie {
    private String nume;
    private double pret;
    private int nrBucati;

    public ProdusBucatarie(String nume, double pret, int nrBucati) {
        this.nume = nume;
        this.pret = pret;
        this.nrBucati = nrBucati;
    }

    @Override
    public void printeazaFactura() {
        System.out.println("Factura: " + nrBucati + nume + " = " + pret*nrBucati);
    }
}
