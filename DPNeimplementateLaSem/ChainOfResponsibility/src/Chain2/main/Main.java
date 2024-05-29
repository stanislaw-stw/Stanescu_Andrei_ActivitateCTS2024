package Chain2.main;

import Chain2.classes.Client;
import Chain2.classes.Notificator;
import Chain2.classes.NotificatorEmail;
import Chain2.classes.NotificatorManager;
import Chain2.classes.NotificatorSMS;

public class Main {
    public static void main(String[] args) {
        Notificator sms = new NotificatorSMS();
        Notificator email = new NotificatorEmail();
        Notificator manager = new NotificatorManager();

        sms.setUrmatorulNotificator(email);
        email.setUrmatorulNotificator(manager);

        Client client1 = new Client("Albert", "0722222222", null);
        Client client2 = new Client("Mihnea", null, "mihnea@yahoo.com");
        Client client3 = new Client("Albert", null, null);


        sms.notifica(client1, "Mesaj important pentru Albert");
        sms.notifica(client2, "Mesaj important pentru Albert");
        sms.notifica(client3, "Mesaj important pentru Albert");
    }
}
