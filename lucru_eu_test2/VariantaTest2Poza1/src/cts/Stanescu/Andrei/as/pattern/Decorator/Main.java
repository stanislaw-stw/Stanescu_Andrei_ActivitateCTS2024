package cts.Stanescu.Andrei.as.pattern.Decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IProdus> produse = new ArrayList<>();
        produse.add(new ProdusConcret("Laptop", 1200, 5));
        produse.add(new ProdusConcret("Smartphone", 800, 2));
        produse.add(new ProdusConcret("Tablet", 600, 10));

        Decorator decoratorDesc = new DecoratorSortarePretDescrescator(new ProdusConcret("Placeholder", 0, 0));
        ((DecoratorSortarePretDescrescator)decoratorDesc).sortare(produse);

        Decorator decoratorRecenzii = new DecoratorFiltrareRecenzii(new ProdusConcret("Placeholder", 0, 0), 3);
        ((DecoratorFiltrareRecenzii)decoratorRecenzii).filtrare(produse);
    }
}
