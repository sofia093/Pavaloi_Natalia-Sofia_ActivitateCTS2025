package clase;

public class StaticBlockConnection {
    private int date;

    private StaticBlockConnection(int date) {
        this.date = date;
    }

    private static StaticBlockConnection staticBlockConnection = null;

    static{
        try{
            staticBlockConnection = new StaticBlockConnection(1);
        } catch (Exception e) {
            throw new RuntimeException("StaticBlockConnection failed");
        }
    }

    public static StaticBlockConnection getStaticBlockConnection() {
        return staticBlockConnection;
    }
}
