package main;

import classes.ManagerPachete;
import classes.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet = new PachetTuristic();
        ManagerPachete manager = new ManagerPachete();

        pachet.setPret(1000);
        manager.adaugaMemento(pachet.salvareMemento());

        pachet.setPret(1200);
        manager.adaugaMemento(pachet.salvareMemento());

        pachet.setPret(1500);

        pachet.undoToMemento(manager.getLastMemento());
        System.out.println("Pretul curent dupa revenire: " + pachet.getPret());
    }
}