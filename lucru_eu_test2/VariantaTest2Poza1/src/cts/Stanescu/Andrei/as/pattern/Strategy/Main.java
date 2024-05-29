package cts.Stanescu.Andrei.as.pattern.Strategy;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IProdus> produse = new ArrayList<>();
        produse.add(new ProdusConcret("Laptop", 1500, 10));
        produse.add(new ProdusConcret("Smartphone", 800, 0));
        produse.add(new ProdusConcret("Tablet", 600, 5));

        IVizualizareStrategie strategie = new VizualizareCrescatorPret();
        strategie.vizualizeaza(produse);

        strategie = new VizualizareDescrescatorPret();
        strategie.vizualizeaza(produse);

        strategie = new VizualizareCuRecenzii();
        strategie.vizualizeaza(produse);
    }
}

