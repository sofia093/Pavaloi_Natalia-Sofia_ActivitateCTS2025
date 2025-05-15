package clase;

public class SMS extends Notificare {
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon() != null) {
            System.out.println(client.getNume() + " ,ai primit mesajul: " + mesaj);
        }else{
            super.getUrmNotificare().notifica(client, mesaj);
        }
    }
}
