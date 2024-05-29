package cts.Stanescu.Andrei.as.pattern.Strategy2;

import java.util.List;

public class Context {
    private IStrategy strategie;

    public Context(IStrategy strategie) {
        this.strategie = strategie;
    }

    public void setStrategie(IStrategy strategie) {
        this.strategie = strategie;
    }

    public void operatie(List<IProdus> produse) {
        strategie.algoritm(produse);
    }
}

