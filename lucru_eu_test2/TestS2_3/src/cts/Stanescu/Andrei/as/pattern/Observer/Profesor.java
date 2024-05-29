package cts.Stanescu.Andrei.as.pattern.Observer;

public class Profesor extends Subject {
    public void anuntaModificare(String message) {
        notifyObservers(message);
    }
}
