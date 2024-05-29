package cts.Stanescu.Andrei.as.pattern.Decorator;

import java.util.List;
import java.util.stream.Collectors;

public class DecoratorFiltrareRecenzii extends Decorator {
    private int minimRecenzii;

    public DecoratorFiltrareRecenzii(IProdus produsDecorat, int minimRecenzii) {
        super(produsDecorat);
        this.minimRecenzii = minimRecenzii;
    }

    public void filtrare(List<IProdus> produse) {
        List<IProdus> produseFiltrate = produse.stream()
                .filter(p -> p.getNumarRecenzii() >= minimRecenzii)
                .collect(Collectors.toList());
        System.out.println("Produse cu cel putin " + minimRecenzii + " recenzii:");
        for (IProdus produs : produseFiltrate) {
            System.out.println(produs.descriereProdus());
        }
    }
}

