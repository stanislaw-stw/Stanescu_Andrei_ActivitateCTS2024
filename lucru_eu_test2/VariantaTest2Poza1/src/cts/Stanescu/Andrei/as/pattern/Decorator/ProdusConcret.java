package cts.Stanescu.Andrei.as.pattern.Decorator;

public class ProdusConcret implements IProdus {
    private String nume;
    private double pret;
    private int numarRecenzii;

    public ProdusConcret(String nume, double pret, int numarRecenzii) {
        this.nume = nume;
        this.pret = pret;
        this.numarRecenzii = numarRecenzii;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public int getNumarRecenzii() {
        return numarRecenzii;
    }

    @Override
    public String descriereProdus() {
        return String.format("Produs: %s, Pret: %.2f, Recenzii: %d", nume, pret, numarRecenzii);
    }
}