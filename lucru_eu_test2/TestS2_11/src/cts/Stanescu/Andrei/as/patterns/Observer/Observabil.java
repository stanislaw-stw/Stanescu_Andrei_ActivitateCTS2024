package cts.Stanescu.Andrei.as.patterns.Observer;
import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observer> observatori = new ArrayList<>();
    protected int numarPersoaneCoada;

    public void adaugaObservator(Observer observator) {
        observatori.add(observator);
    }

    public void stergeObservator(Observer observator) {
        observatori.remove(observator);
    }

    public void notificaObservatori() {
        for (Observer observator : observatori) {
            observator.notificare(numarPersoaneCoada);
        }
    }

    public abstract void modificareStare();
}
