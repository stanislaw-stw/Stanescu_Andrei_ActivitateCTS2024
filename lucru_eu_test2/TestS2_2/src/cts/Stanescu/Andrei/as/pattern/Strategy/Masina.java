package cts.Stanescu.Andrei.as.pattern.Strategy;

public class Masina {
    private String nume;
    private ModSpalare strategie;

    public Masina(String nume) {
        this.nume = nume;
    }

    public void setModSpalare(ModSpalare strategie) {
        this.strategie = strategie;
    }

    public void spalaMasina() {
        System.out.println("Spalarea masinii " + this.nume + ":");
        strategie.spala();
    }
}
