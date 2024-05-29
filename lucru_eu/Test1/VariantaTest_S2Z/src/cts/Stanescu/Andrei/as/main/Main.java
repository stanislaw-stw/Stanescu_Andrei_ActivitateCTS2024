package cts.Stanescu.Andrei.as.main;

import cts.Stanescu.Andrei.as.builder.JucatorBuilder;
import cts.Stanescu.Andrei.as.prototype.Jucator;
import cts.Stanescu.Andrei.as.prototype.JucatorPrototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jucator jucator1 = new JucatorBuilder()
                .setTipJucator("portar")
                .addAntrenament("antrenament portar 1")
                .addMedicamentInterzis("medicament1")
                .build();

        Jucator jucator2 = new JucatorBuilder()
                .setTipJucator("atacant")
                .addAntrenament("antrenament atacant 1")
                .addMedicamentInterzis("medicament1")
                .build();

        JucatorPrototype jucator3 = jucator2.clone();
        jucator3.addAntrenament("antrenament atacant 2");

        jucator1.addMedicamentInterzis("medicament2");
        jucator1.addAntrenament("antrenament portar 2");
        jucator1.addAntrenament("antrenament portar 3");


        System.out.println(jucator1);
        System.out.println(jucator2);
        System.out.println(jucator3);

        simuleazaAntrenament(jucator1);
        simuleazaAntrenament(jucator2);
        simuleazaAntrenament((Jucator)jucator3);

        simuleazaTestAntiDoping(jucator1);
        simuleazaTestAntiDoping(jucator2);
        simuleazaTestAntiDoping((Jucator)jucator3);
    }

    public static void simuleazaAntrenament(Jucator jucator) {
        System.out.println("Antrenament pentru jucatorul de tip " + jucator.getTipJucator() + ": " + jucator.getAntrenamente());
    }

    public static void simuleazaTestAntiDoping(Jucator jucator) {
        System.out.println("Test anti-doping pentru jucatorul de tip " + jucator.getTipJucator() + ": " + jucator.getMedicamenteInterzise());
    }

}