package classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerPachete {

    private List<MementoPachetTuristic> lista = new ArrayList<>();

    public void adaugaMemento(MementoPachetTuristic memento) {
        lista.add(memento);
    }

    public MementoPachetTuristic getMemento(int index) {
        return lista.get(index);
    }

    public MementoPachetTuristic getLastMemento() {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(lista.size() - 1);
    }
}