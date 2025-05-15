package clase;

public class MasaFereastra extends AsezareMasa {
    public MasaFereastra(String numeChelner) {
        super(numeChelner);
    }

    @Override
    public void curatareMasa() {
        System.out.println(numeChelner + " curata masa de langa fereastra");
    }

    @Override
    public void asezareServetele() {
        System.out.println(numeChelner + " aranjeaza servetelele de langa fereastra");
    }

    @Override
    public void asezareTacamuri() {
        System.out.println(numeChelner + " aranjeaza tacamurile de langa fereastra");
    }

    @Override
    public void inivitareLaMasa() {
        System.out.println(numeChelner + " inivita clientii de langa fereastra");
    }

    @Override
    public void asezareLaMasa() {
        System.out.println("Clientii se aseaza de langa fereastra");
    }
}
