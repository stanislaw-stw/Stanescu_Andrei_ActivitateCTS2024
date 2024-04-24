package Observer;

import Observer.observer.Abonat;
import Observer.observer.Observer;
import Observer.observer.Vecini;
import Observer.subject.Sala;
import Observer.subject.Stadion;
import Observer.subject.Subject;

public class Main {
    public static void main(String[] args) {
        Observer abonat1 = new Abonat("Gigel1");
        Observer abonat2 = new Abonat("Gigel2");
        Observer abonat3 = new Abonat("Gigel3");
        Observer vecin = new Vecini("Gigel",12);

        Subject sala = new Sala();
        sala.adaugaAbonat(abonat1);
        sala.adaugaAbonat(abonat2);
        sala.adaugaAbonat(abonat3);

        sala.notificaMeciFotbal();
        System.out.println("--------------------");

        sala.stergeAbonat(abonat2);
        sala.adaugaAbonat(vecin);
        sala.notificaMeciVolei();
        System.out.println("--------------------");

        Subject stadion = new Stadion();

        stadion.adaugaAbonat(abonat1);
        stadion.adaugaAbonat(vecin);

        ((Stadion)stadion).notificaConcert();

    }
}
