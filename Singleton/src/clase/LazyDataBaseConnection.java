package clase;

public class LazyDataBaseConnection {
    private String nume;

    private LazyDataBaseConnection(String nume) {
        this.nume = nume;
    }

    private static LazyDataBaseConnection instance = null;

    public static synchronized LazyDataBaseConnection getInstance() {
        if (instance == null) {
            instance =new LazyDataBaseConnection("Conexiune");
        }
        return instance;
    }
}
