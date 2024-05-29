package cts.Stanescu.Andrei.as.pattern.Strategy2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategieC implements IStrategy{
    @Override
    public void algoritm(List<IProdus> produse) {
        Collections.sort(produse, Comparator.comparingDouble(IProdus::getPret).reversed());
        System.out.println("Sortare descresc dupa pret aplicata.");
        for (IProdus produs : produse) {
            System.out.println(produs.getDescriere() + " - Pret: " + produs.getPret());
        }
    }
}
