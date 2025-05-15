package clase;

public class Cash implements IMetodaPlata {
    private int sumaCash;

    public Cash(int sumaCash) {
        this.sumaCash = sumaCash;
    }

    @Override
    public void plateste() {
        if(sumaCash != 0){
            System.out.println("Ai platit cash.");
        }
    }
}
