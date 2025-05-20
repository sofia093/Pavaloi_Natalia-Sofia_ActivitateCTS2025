package clase;

public class DecoratorLMA extends DecoratorNota{

    public DecoratorLMA(INotaDePlata nota) {
        super(nota);
    }

    @Override
    public void trimiteMesaj() {
        System.out.println("La multi ani!");
    }
}
