package clase;

public class NotificareEmail extends Notificare {

    @Override
    public void notifica(Client client) {
        if(client.getMail() != null){
            System.out.println(client.getNume()+", ati primit o oferta noua pe mail.");
        }else{
            super.getUrmNotificare().notifica(client);
        }
    }
}
