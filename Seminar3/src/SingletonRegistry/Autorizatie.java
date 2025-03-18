package SingletonRegistry;

public class Autorizatie {
    private String destinatar;
    private String data;
    private int nrAutorizatie;

    public Autorizatie(String destinatar, String data, int nrAutorizatie) {
        this.destinatar = destinatar;
        this.data = data;
        this.nrAutorizatie = nrAutorizatie;
    }

    @Override
    public String toString() {
        return "Autorizatie{" +
                "destinatar='" + destinatar + '\'' +
                ", data='" + data + '\'' +
                ", nrAutorizatie=" + nrAutorizatie +
                '}';
    }
}
