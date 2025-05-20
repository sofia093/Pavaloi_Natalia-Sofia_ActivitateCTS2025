package clase;

public class NotificareSMS extends Notificare {

    @Override
    public void notifica(Client client) {
        if(client.getNrTelefon() != null ){
            System.out.println(client.getNume()+ ", ati primit o noua oferta prin SMS");
        }else if(super.getUrmNotificare() != null){
            super.getUrmNotificare().notifica(client);
        }else{
            System.out.println("Nu s-a putut trimite mesajul.");
        }
    }
}
