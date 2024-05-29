package cts.Stanescu.Andrei.as.pattern.Decorator;

public abstract class Decorator implements IProdus {
    protected IProdus produsDecorat;

    public Decorator(IProdus produsDecorat) {
        this.produsDecorat = produsDecorat;
    }

    public double getPret() {
        return produsDecorat.getPret();
    }

    public int getNumarRecenzii() {
        return produsDecorat.getNumarRecenzii();
    }

    public String descriereProdus() {
        return produsDecorat.descriereProdus();
    }
}
