package clase;

public class BiletMetrou implements IBiletMetrou {
    private int nrCalatorii;

    public BiletMetrou(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void validareBilet() {
        if(nrCalatorii >= 1) {
            System.out.println("A fost validat biletul de metrou.");
        }else{
            System.out.println("Nu mai aveti calatorii pe bilet.");
        }
    }
}
