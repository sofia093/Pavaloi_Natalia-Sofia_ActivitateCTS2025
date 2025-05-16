package clase;

public abstract class ADepartament {
    public abstract void afisareInfo() throws Exception;
    public abstract void adaugaNod(ADepartament structura) throws Exception;
    public abstract void stergeNod(ADepartament structura) throws Exception;
    public abstract ADepartament getNodCopil(int index) throws Exception;

}
