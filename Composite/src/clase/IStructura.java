package clase;

public interface IStructura {
    void descriereStructura() throws Exception;;

    void adaugaNod(IStructura structura) throws Exception;
    void stergeNod(IStructura structura) throws Exception;
    IStructura getNodCopil(int index) throws Exception;
}
