package clase;

public class Sectie extends ADepartament{
    private String numeSectie;

    public Sectie(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void afisareInfo() throws Exception {
        System.out.println(numeSectie);
    }

    @Override
    public void adaugaNod(ADepartament structura) throws Exception {
        throw new Exception("Nu poate adauga");
    }

    @Override
    public void stergeNod(ADepartament structura) throws Exception {
        throw new Exception("Nu poate sterge");
    }

    @Override
    public ADepartament getNodCopil(int index) throws Exception {
        throw new Exception("Nu poate returna nodul");
    }

}
