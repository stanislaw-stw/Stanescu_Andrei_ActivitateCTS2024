package cts.Stanescu.Andrei.as.patterns.Observer;

public class Main {
    public static void main(String[] args) {
        Spalatoria spalatoria = new Spalatoria();
        spalatoria.adaugaObservator(new ObserverA("Ion"));
        spalatoria.adaugaObservator(new ObserverB("Maria"));

        spalatoria.clientNouInCoada();
        spalatoria.slotEliberat();
        spalatoria.clientNouInCoada();
        spalatoria.clientNouInCoada();
        spalatoria.slotEliberat();
    }
}

