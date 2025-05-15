package main;

import clase.*;

//B16
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Stefan");

        Notificare sms = new SMS();
        Notificare email = new Email();
        Notificare manager = new Manager();

        sms.setUrmNotificare(email);
        email.setUrmNotificare(manager);

        sms.notifica(client, "Ati rezervat camera 101 cu succes.");

        client.setNrTelefon("078765627");
        sms.notifica(client, "Ati rezervat camera 376 cu succes.");

    }
}