package cts.Stanescu.Andrei.as.pattern.Decorator;

import java.util.Collections;
import java.util.List;

public class DecoratorSortarePretDescrescator extends Decorator {
    public DecoratorSortarePretDescrescator(IProdus produsDecorat) {
        super(produsDecorat);
    }

    public void sortare(List<IProdus> produse) {
        Collections.sort(produse, (p1, p2) -> Double.compare(p2.getPret(), p1.getPret()));
        System.out.println("Produse sortate descresc dupa pret:");
        for (IProdus produs : produse) {
            System.out.println(produs.descriereProdus());
        }
    }
}
