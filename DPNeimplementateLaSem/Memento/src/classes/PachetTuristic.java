package classes;

public class PachetTuristic {
    private double pret;

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public MementoPachetTuristic salvareMemento() {
        return new MementoPachetTuristic(pret);
    }

    public void undoToMemento(MementoPachetTuristic memento) {
        this.pret = memento.get_pret();
    }
}