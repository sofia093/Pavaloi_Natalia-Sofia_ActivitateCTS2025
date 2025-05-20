package clase;

public abstract class AInternare {
    public abstract void analizaStare();
    public abstract void verificareDisponibilitate();
    public abstract void emitereFisaIternare();

    public final void internare(){
        analizaStare();
        verificareDisponibilitate();
        emitereFisaIternare();
    }
}
