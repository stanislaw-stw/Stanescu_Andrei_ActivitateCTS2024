package Chain2.classes;

public class NotificatorSMS extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getTelefon() != null) {
            System.out.println("Trimite SMS catre " + client.getTelefon() + ": " + mesaj);
        } else if(urmatorulNotificator != null) {
            urmatorulNotificator.notifica(client, mesaj);
        }
    }
}
