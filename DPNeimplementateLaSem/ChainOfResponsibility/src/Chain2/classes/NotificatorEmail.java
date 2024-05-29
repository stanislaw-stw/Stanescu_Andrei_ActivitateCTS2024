package Chain2.classes;

public class NotificatorEmail extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null){
            System.out.println("Trimite email catre " + client.getEmail() + ": " + mesaj);
        } else if(urmatorulNotificator != null){
            urmatorulNotificator.notifica(client, mesaj);
        }
    }
}
