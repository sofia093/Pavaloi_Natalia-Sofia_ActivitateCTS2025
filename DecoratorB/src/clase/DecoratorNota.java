package clase;

public abstract class DecoratorNota implements INotaDePlata {
    private INotaDePlata nota;

    public DecoratorNota(INotaDePlata nota) {
        this.nota = nota;
    }

    @Override
    public void trimiteNota() {
        nota.trimiteNota();
    }

    public abstract void trimiteMesaj();
}
