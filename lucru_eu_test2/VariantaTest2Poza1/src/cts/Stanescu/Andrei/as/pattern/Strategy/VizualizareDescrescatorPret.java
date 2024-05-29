package cts.Stanescu.Andrei.as.pattern.Strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VizualizareDescrescatorPret implements IVizualizareStrategie {
    @Override
    public void vizualizeaza(List<IProdus> produse) {
        Collections.sort(produse, Comparator.comparingDouble(IProdus::getPret).reversed());
        produse.forEach(p -> System.out.println(p.getDescriere() + " - Pret: " + p.getPret()));
    }
}

