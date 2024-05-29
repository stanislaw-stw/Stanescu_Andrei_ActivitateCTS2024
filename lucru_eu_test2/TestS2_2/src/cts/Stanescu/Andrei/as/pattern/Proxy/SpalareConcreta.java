package cts.Stanescu.Andrei.as.pattern.Proxy;

public class SpalareConcreta implements InterfataSpalare {
    public void spalaMasina(Client client) {
        System.out.println("Masina clientului " + client.getNume() + " a fost spalata.");
    }
}
