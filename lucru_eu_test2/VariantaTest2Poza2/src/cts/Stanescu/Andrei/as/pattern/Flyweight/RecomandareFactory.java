package cts.Stanescu.Andrei.as.pattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class RecomandareFactory {
    private Map<String, Recomandare> recomandari;

    public RecomandareFactory() {
        recomandari = new HashMap<String, Recomandare>();
    }

    public Recomandare getRecomandare(String sfaturi) {
        Recomandare recomandare = recomandari.get(sfaturi);
        if (recomandare == null) {
            recomandare = new RecomandareConcreta(sfaturi);
            recomandari.put(sfaturi, recomandare);
        }
        return recomandare;
    }
}
