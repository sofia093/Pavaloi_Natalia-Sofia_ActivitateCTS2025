package clase;

public abstract class AMeniu {
    public abstract void descrie();
    public abstract void adaugaNod(AMeniu item) throws Exception;
    public abstract void stergeNod(AMeniu item) throws Exception;
    public abstract AMeniu getNodCopil(int index) throws Exception;
}
