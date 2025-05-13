package clase;

public class CardCalatorie implements IMetodaPlata {
    int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void plateste(float pretBilet) {
        if(nrCalatoriiRamase >0) {
            nrCalatoriiRamase--;
            System.out.println("Ai platiti cu cardul de calatorie si ai ramas cu " + nrCalatoriiRamase + " de calatorii.");
        }else{
            System.out.println("Nu mai ai calatorii ramase pe card.");
        }
    }
}
