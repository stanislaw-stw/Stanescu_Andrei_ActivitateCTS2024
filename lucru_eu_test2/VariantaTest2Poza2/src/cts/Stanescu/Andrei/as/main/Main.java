package cts.Stanescu.Andrei.as.main;

import cts.Stanescu.Andrei.as.pattern.Flyweight.RecomandareFactory;
import cts.Stanescu.Andrei.as.pattern.Flyweight.Reteta;
import cts.Stanescu.Andrei.as.pattern.Flyweight.RecomandareConcreta;
import cts.Stanescu.Andrei.as.pattern.Flyweight.Recomandare;
import cts.Stanescu.Andrei.as.pattern.Template.Pacient;
import cts.Stanescu.Andrei.as.pattern.Template.SpitalPrivat;
import cts.Stanescu.Andrei.as.pattern.Template.SpitalStat;
import cts.Stanescu.Andrei.as.pattern.Template.Spital;

public class Main {
    public static void main(String[] args) {
        Spital spitalStat = new SpitalStat();
        Spital spitalPrivat = new SpitalPrivat();

        Pacient pacient1 = new Pacient("Ion", false);
        Pacient pacient2 = new Pacient("Maria", true);

        spitalStat.preluareCazNou(pacient1);
        spitalPrivat.preluareCazNou(pacient2);


        System.out.println("---- VERIFICARE FLYWEIGHT-----");

        RecomandareFactory fabrica = new RecomandareFactory();

        Reteta reteta1 = new Reteta("Reteta 1");
        Reteta reteta2 = new Reteta("Reteta 2");
        Reteta reteta3 = new Reteta("Reteta 3");
        Reteta reteta4 = new Reteta("Reteta 4");

        String sfaturiGenerale1 = "Consuma 2 litri de apa pe zi si dormi minim 7 ore.";
        String sfaturiGenerale2 = "Evita consumul de sare si zahar in exces.";

        fabrica.getRecomandare(sfaturiGenerale1).printRecomandare(reteta1);
        fabrica.getRecomandare(sfaturiGenerale2).printRecomandare(reteta2);
        fabrica.getRecomandare(sfaturiGenerale1).printRecomandare(reteta3);
        fabrica.getRecomandare(sfaturiGenerale2).printRecomandare(reteta4);

    }
}