package cts.Stanescu.Andrei.as.pattern.Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class VizualizareCuRecenzii implements IVizualizareStrategie {
    @Override
    public void vizualizeaza(List<IProdus> produse) {
        List<IProdus> filtrate = produse.stream()
                .filter(p -> p.getNumarRecenzii() > 0)
                .collect(Collectors.toList());
        filtrate.forEach(p -> System.out.println(p.getDescriere() + " - Recenzii: " + p.getNumarRecenzii()));
    }
}

