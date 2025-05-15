package clase;

public class MasaColt extends AsezareMasa {
    public MasaColt(String numeChelner) {
        super(numeChelner);
    }

    @Override
    public void curatareMasa() {
        System.out.println(numeChelner + " curata masa din colt");
    }

    @Override
    public void asezareServetele() {
        System.out.println(numeChelner + " aranjeaza servetelele pe masa din colt");
    }

    @Override
    public void asezareTacamuri() {
        System.out.println(numeChelner + " aranjeaza tacamurile pe masa din colt");
    }

    @Override
    public void inivitareLaMasa() {
        System.out.println(numeChelner + " inivita clientii la masa din colt");
    }

    @Override
    public void asezareLaMasa() {
        System.out.println("Clientii se aseaza la masa din colt");
    }
}
