package Chain.classes;

public class NotificatorEmail extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getEmail() != null) {
            System.out.println("Trimite Email catre " + client.getNume() + ": " + mesaj);
        } else if (urmatorulNotificator != null) {
            urmatorulNotificator.notifica(client, mesaj);
        }
    }
}