package clase;

public class Email extends Notificare{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null){
            System.out.println(client.getNume() + " ,ai primit mesajul: " + mesaj);
        }else{
            super.getUrmNotificare().notifica(client, mesaj);
        }
    }
}
