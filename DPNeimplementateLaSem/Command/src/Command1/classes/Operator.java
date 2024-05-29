package Command1.classes;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi = new ArrayList<Command>();

    public void invoca(Command comanda) {
        comenzi.add(comanda);
        comanda.execute();
    }
}
