package Chain2.classes;

public class NotificatorManager extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Managerul trimite notificarea catre " + client.getNume() + ": " + mesaj);
    }
}
