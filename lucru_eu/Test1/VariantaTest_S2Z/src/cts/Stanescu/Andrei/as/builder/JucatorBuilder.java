package cts.Stanescu.Andrei.as.builder;

import cts.Stanescu.Andrei.as.prototype.Jucator;

import java.util.ArrayList;

public class JucatorBuilder implements AbstractBuilder {

    private String tipJucator;
    private ArrayList<String> antrenamente;
    private ArrayList<String> medicamenteInterzise;

    public JucatorBuilder() {
        this.tipJucator = "";
        this.antrenamente = new ArrayList<>();
        this.medicamenteInterzise = new ArrayList<>();
    }

    public JucatorBuilder addAntrenament(String antrenament){
        this.antrenamente.add(antrenament);
        return this;
    }

    public JucatorBuilder addMedicamentInterzis(String medicament){
        this.medicamenteInterzise.add(medicament);
        return this;
    }

    public JucatorBuilder setTipJucator(String tipJucator) {
        this.tipJucator = tipJucator;
        return this;
    }

    @Override
    public Jucator build() {
        Jucator jucator = new Jucator();
        jucator.setTipJucator(this.tipJucator);
        jucator.setAntrenamente(this.antrenamente);
        jucator.setMedicamenteInterzise(this.medicamenteInterzise);
        return jucator;
    }
}
