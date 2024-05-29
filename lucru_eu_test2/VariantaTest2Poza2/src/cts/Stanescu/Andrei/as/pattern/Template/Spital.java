package cts.Stanescu.Andrei.as.pattern.Template;

public abstract class Spital {
    public final void preluareCazNou(Pacient pacient) {
        verificareSemneVitale(pacient);
        if (pacient.areSuspiciuniGrave()) {
            interventieUrgenta(pacient);
        } else {
            programareMedicFamilie();
        }
        verificareLocInternare();
    }

    protected abstract void verificareSemneVitale(Pacient pacient);
    protected abstract void interventieUrgenta(Pacient pacient);
    protected abstract void programareMedicFamilie();
    protected abstract void verificareLocInternare();
}
