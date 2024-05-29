package Chain.classes;

public class NotificatorManager extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Managerul trimite notificare catre " + client.getNume() + ": " + mesaj);
    }
}