package Chain2.classes;

public abstract class Notificator {
    protected Notificator urmatorulNotificator;

    public void setUrmatorulNotificator(Notificator urmatorulNotificator) {
        this.urmatorulNotificator = urmatorulNotificator;
    }

    public abstract void notifica(Client client, String mesaj);
}
