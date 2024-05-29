package cts.Stanescu.Andrei.as.pattern.Proxy;

public class Main {
    public static void main(String[] args) {
        SpalareProxy spalareProxy = new SpalareProxy();
        Client client1 = new Client("Ion", true);
        Client client2 = new Client("Vasile", false);
        Client client3 = new Client("Maria", true);
        Client client4 = new Client("Elena", false);
        Client client5 = new Client("Andrei", true);

        spalareProxy.spalaMasina(client1);
        spalareProxy.spalaMasina(client2);
        spalareProxy.spalaMasina(client3);
        spalareProxy.spalaMasina(client4);
        spalareProxy.spalaMasina(client5);
    }
}
