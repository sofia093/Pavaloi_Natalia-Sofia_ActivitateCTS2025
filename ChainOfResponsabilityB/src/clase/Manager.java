package clase;

public class Manager extends Notificare{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Mesajul: '" + mesaj +"' nu a putut fi transmis clientului " + client.getNume());
    }
}
