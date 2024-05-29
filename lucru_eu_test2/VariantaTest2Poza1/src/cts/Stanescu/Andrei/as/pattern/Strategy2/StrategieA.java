package cts.Stanescu.Andrei.as.pattern.Strategy2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategieA implements IStrategy {
    @Override
    public void algoritm(List<IProdus> produse) {
        Collections.sort(produse, Comparator.comparingDouble(IProdus::getPret));
        System.out.println("Sortare cresc dupa pret aplicata.");

        // Afișează produsele după sortare
        for (IProdus produs : produse) {
            System.out.println(produs.getDescriere() + " - Pret: " + produs.getPret());
        }
    }
}
