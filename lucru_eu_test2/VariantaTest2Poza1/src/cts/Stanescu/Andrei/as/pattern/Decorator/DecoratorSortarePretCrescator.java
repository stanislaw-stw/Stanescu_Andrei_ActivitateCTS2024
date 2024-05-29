package cts.Stanescu.Andrei.as.pattern.Decorator;

import java.util.Collections;
import java.util.List;

public class DecoratorSortarePretCrescator extends Decorator {
    public DecoratorSortarePretCrescator(IProdus produsDecorat) {
        super(produsDecorat);
    }

    public void sortare(List<IProdus> produse) {
        Collections.sort(produse, (p1, p2) -> Double.compare(p1.getPret(), p2.getPret()));
        for (IProdus produs : produse) {
            System.out.println(produs.descriereProdus());
        }
    }
}
