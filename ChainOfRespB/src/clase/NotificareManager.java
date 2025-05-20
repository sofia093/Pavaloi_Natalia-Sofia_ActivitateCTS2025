package clase;

public class NotificareManager extends Notificare {
    @Override
    public void notifica(Client client) {
        System.out.println("Managerul a primit notificare.");
    }
}
