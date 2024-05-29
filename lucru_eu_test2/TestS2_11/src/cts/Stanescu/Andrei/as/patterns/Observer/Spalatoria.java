package cts.Stanescu.Andrei.as.patterns.Observer;

public class Spalatoria extends Observabil {

    public void clientNouInCoada() {
        numarPersoaneCoada++;
        notificaObservatori();
    }

    public void slotEliberat() {
        numarPersoaneCoada--;
        notificaObservatori();
    }

    @Override
    public void modificareStare() {
        notificaObservatori();
    }
}

