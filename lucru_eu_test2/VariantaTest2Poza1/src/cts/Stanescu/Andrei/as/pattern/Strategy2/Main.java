package cts.Stanescu.Andrei.as.pattern.Strategy2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IProdus> produse = new ArrayList<>();
        produse.add(new ProdusConcret("Laptop", 1200.00, 5));
        produse.add(new ProdusConcret("Tablet", 300.00, 0));
        produse.add(new ProdusConcret("Smartphone", 800, 2));

        Context context = new Context(new StrategieA());
        context.operatie(produse);

        context.setStrategie(new StrategieB());
        context.operatie(produse);

        context.setStrategie(new StrategieC());
        context.operatie(produse);
    }
}

