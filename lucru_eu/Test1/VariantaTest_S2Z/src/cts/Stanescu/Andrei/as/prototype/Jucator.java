package cts.Stanescu.Andrei.as.prototype;

import java.util.ArrayList;
import java.util.List;

public class Jucator implements JucatorPrototype{

    private String tipJucator;

    private List<String> antrenamente;

    private List<String> medicamenteInterzise;

    private Jucator(String tipJucator, List<String> antrenamente, List<String> medicamenteInterzise) {
        this.tipJucator = tipJucator;
        this.antrenamente = new ArrayList<>(antrenamente);
        this.medicamenteInterzise = new ArrayList<>(medicamenteInterzise);
    }

    public Jucator() {
        this.tipJucator = "";
        this.antrenamente = new ArrayList<>();
        this.medicamenteInterzise = new ArrayList<>();
    }

    public void addAntrenament(String antrenament) {
        this.antrenamente.add(antrenament);
    }

    public void addMedicamentInterzis(String medicament) {
        this.medicamenteInterzise.add(medicament);
    }

    public String getTipJucator() {
        return tipJucator;
    }

    public void setTipJucator(String tipJucator) {
        this.tipJucator = tipJucator;
    }

    public List<String> getAntrenamente() {
        return antrenamente;
    }


    public List<String> getMedicamenteInterzise() {
        return medicamenteInterzise;
    }

    public void setAntrenamente(List<String> antrenamente) {
        this.antrenamente = new ArrayList<>(antrenamente);
    }

    public void setMedicamenteInterzise(List<String> medicamenteInterzise) {
        this.medicamenteInterzise = new ArrayList<>(medicamenteInterzise);
    }

    @Override
    public JucatorPrototype clone() {
        Jucator copie = new Jucator();
        copie.setTipJucator(this.tipJucator);
        copie.setAntrenamente(this.antrenamente);
        copie.setMedicamenteInterzise(this.medicamenteInterzise);
        return copie;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "tipJucator='" + tipJucator + '\'' +
                ", antrenamente=" + antrenamente +
                ", medicamenteInterzise=" + medicamenteInterzise +
                '}';
    }
}
