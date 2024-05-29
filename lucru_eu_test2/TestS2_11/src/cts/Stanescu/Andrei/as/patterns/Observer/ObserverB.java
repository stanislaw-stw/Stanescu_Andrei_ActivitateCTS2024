package cts.Stanescu.Andrei.as.patterns.Observer;


public class ObserverB implements Observer {
    private String nume;

    public ObserverB(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(int numarPersoaneCoada) {
        if (numarPersoaneCoada == 0) {
            System.out.println("Observer B - " + nume + ": Vino acum, slotul de spalare este liber!");
        } else {
            System.out.println("Observer B - " + nume + ": Mai sunt " + numarPersoaneCoada + " persoane inaintea ta.");
        }
    }
}
