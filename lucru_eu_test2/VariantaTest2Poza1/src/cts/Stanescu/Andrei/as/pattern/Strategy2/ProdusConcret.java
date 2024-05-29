package cts.Stanescu.Andrei.as.pattern.Strategy2;

public class ProdusConcret implements IProdus {
    private String descriere;
    private double pret;
    private int numarRecenzii;

    public ProdusConcret(String descriere, double pret, int numarRecenzii) {
        this.descriere = descriere;
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
    public String getDescriere() {
        return descriere;
    }
}
