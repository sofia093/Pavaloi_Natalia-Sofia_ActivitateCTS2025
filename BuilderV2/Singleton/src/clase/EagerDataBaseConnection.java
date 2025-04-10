package clase;

public class EagerDataBaseConnection {
    private String nume;

    private EagerDataBaseConnection(String nume) {
        this.nume = nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    private static EagerDataBaseConnection eagerDataBaseConnection = new EagerDataBaseConnection("Conexiune");

    public static EagerDataBaseConnection getEagerDataBaseConnection() {
        return eagerDataBaseConnection;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EagerDataBaseConnection{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
