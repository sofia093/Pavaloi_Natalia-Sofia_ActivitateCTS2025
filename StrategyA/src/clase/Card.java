package clase;

public class Card implements IMetodaPlata {
    @Override
    public void plateste() {
        System.out.println("Ai platit cu cardul.");
    }
}
