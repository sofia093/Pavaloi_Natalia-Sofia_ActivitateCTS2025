package main;

import clase.*;

//B16
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Dana");

        Notificare notificareSMS = new NotificareSMS();
        Notificare notificareEmail = new NotificareEmail();
        NotificareManager notificareManager = new NotificareManager();

        notificareSMS.setUrmNotificare(notificareEmail);
        //notificareEmail.setUrmNotificare(notificareManager);
        //runtime error

        notificareSMS.notifica(client);

        client.setMail("sdfgh@gmai.com");
        notificareSMS.notifica(client);

    }
}