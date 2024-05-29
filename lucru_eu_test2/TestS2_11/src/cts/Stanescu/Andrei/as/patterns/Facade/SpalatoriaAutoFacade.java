package cts.Stanescu.Andrei.as.patterns.Facade;

public class SpalatoriaAutoFacade {
    private Degresator degresator = new Degresator();
    private Spumant spumant = new Spumant();
    private Laveta laveta = new Laveta();

    public void doarSpalare() {
        laveta.stergeMasina();
    }

    public void spalareCuDegresare() {
        degresator.aplicaDegresant();
        laveta.stergeMasina();
    }

    public void spalareCuSpuma() {
        spumant.aplicaSpuma();
        laveta.stergeMasina();
    }

    public void spalareCompleta() {
        degresator.aplicaDegresant();
        spumant.aplicaSpuma();
        laveta.stergeMasina();
    }
}

