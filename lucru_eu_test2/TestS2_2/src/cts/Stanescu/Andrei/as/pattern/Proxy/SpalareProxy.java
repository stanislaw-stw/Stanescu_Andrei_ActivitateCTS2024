package cts.Stanescu.Andrei.as.pattern.Proxy;

public class SpalareProxy implements InterfataSpalare {
    private InterfataSpalare interfataSpalare;

    public SpalareProxy() {
        this.interfataSpalare = new SpalareConcreta();
    }

    public void spalaMasina(Client client) {
        if (client.areAbonamentValid()) {
            interfataSpalare.spalaMasina(client);
        } else {
            System.out.println("Ne pare rau, " + client.getNume() + ". Nu sunt locuri disponibile.");
        }
    }
}
