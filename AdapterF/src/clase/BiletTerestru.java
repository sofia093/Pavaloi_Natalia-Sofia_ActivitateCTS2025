package clase;

public class BiletTerestru {
    private int nrCalatorii;

    public BiletTerestru(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    public void controlBilet() {
        if(nrCalatorii >= 1) {
            System.out.println("A fost validat biletul de metrou.");
        }else{
            System.out.println("Nu mai aveti calatorii pe bilet.");
        }
    }
}
