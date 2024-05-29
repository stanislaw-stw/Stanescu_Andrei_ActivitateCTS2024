package CommandF5.classes;

import java.util.ArrayList;
import java.util.List;

public class Sofer {
    private List<Command> comenzi;

    public Sofer() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command comanda) {
        comenzi.add(comanda);
    }

    public void executaComenzi() {
        for (Command comanda : comenzi) {
            comanda.execute();
        }
        comenzi.clear();
    }
}

