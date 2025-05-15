package clase;

public abstract class AsezareMasa {
    protected String numeChelner;

    public AsezareMasa(String numeChelner) {
        this.numeChelner = numeChelner;
    }

    public abstract void curatareMasa();

    public abstract void asezareServetele();

    public abstract void asezareTacamuri();

    public abstract void inivitareLaMasa();

    public abstract void asezareLaMasa();

    public void aranjeazaMasa(){
        curatareMasa();
        asezareServetele();
        asezareTacamuri();
        inivitareLaMasa();
        asezareLaMasa();
    };

}
