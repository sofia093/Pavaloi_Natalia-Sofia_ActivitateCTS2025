package clase;

public class AdapterBar extends ProdusBar implements IProdusBucatarie{
    public AdapterBar(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void printeazaFactura() {
        super.printeazaFacturaBar();
    }
}
