package cts.Stanescu.Andrei.as.pattern.Strategy2;

import java.util.List;
import java.util.stream.Collectors;

public class StrategieB implements IStrategy {
    @Override
    public void algoritm(List<IProdus> produse) {
        List<IProdus> produseFiltrate = produse.stream()
                .filter(p -> p.getNumarRecenzii() > 0)
                .collect(Collectors.toList());
        System.out.println("Produsele cu recenzii sunt:");
        for (IProdus produs : produseFiltrate) {
            System.out.println(produs.getDescriere());
        }
    }
}

