package cts.Stanescu.Andrei.as.pattern.Proxy;

public class Client {
    private String nume;
    private boolean abonamentValid;

    public Client(String nume, boolean abonamentValid) {
        this.nume = nume;
        this.abonamentValid = abonamentValid;
    }

    public String getNume() {
        return nume;
    }

    public boolean areAbonamentValid() {
        return abonamentValid;
    }
}
