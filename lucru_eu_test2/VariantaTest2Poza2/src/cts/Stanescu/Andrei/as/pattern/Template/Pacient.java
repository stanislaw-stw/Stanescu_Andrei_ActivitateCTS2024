package cts.Stanescu.Andrei.as.pattern.Template;

public class Pacient {
    private String nume;
    private boolean suspiciuniGrave;

    public Pacient(String nume, boolean suspiciuniGrave) {
        this.nume = nume;
        this.suspiciuniGrave = suspiciuniGrave;
    }

    public boolean areSuspiciuniGrave() {
        return suspiciuniGrave;
    }

    public String getNume() {
        return nume;
    }

    public void setSuspiciuniGrave(boolean suspiciuniGrave) {
        this.suspiciuniGrave = suspiciuniGrave;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", suspiciuniGrave=" + suspiciuniGrave +
                '}';
    }
}
