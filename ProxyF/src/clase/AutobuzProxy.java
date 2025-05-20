package clase;


public class AutobuzProxy implements IAutobuz {
    private Autobuz autobuz;

    public AutobuzProxy(Autobuz autobuz) {
        this.autobuz = autobuz;
    }



    @Override
    public void afiseazaInformatii() {
        if (autobuz.getLista() != null && !autobuz.getLista().isEmpty()) {
            autobuz.afiseazaInformatii();
        } else {
            System.out.println("Autobuzul merge direct la autobaza deoarece nu mai are calatori.");
        }
    }
}

