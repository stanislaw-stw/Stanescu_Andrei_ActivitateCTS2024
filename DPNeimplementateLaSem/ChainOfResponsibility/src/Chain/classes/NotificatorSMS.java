package Chain.classes;

public class NotificatorSMS extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getTelefon() != null) {
            System.out.println("Trimite SMS catre " + client.getNume() + ": " + mesaj);
        } else if (urmatorulNotificator != null) {
            urmatorulNotificator.notifica(client, mesaj);
        }
    }
}

