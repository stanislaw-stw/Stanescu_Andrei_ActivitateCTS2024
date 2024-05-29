package Chain.main;

import Chain.classes.*;

public class Main {
    public static void main(String[] args) {
        Notificator sms = new NotificatorSMS();
        Notificator email = new NotificatorEmail();
        Notificator manager = new NotificatorManager();

        sms.setUrmatorulNotificator(email);
        email.setUrmatorulNotificator(manager);

        Client client1 = new Client("Alice", "1234567890", null);
        Client client2 = new Client("Bob", null, "bob@example.com");
        Client client3 = new Client("Charlie", null, null);

        sms.notifica(client1, "Mesaj important pentru Alice");
        sms.notifica(client2, "Mesaj important pentru Bob");
        sms.notifica(client3, "Mesaj important pentru Charlie");
    }
}