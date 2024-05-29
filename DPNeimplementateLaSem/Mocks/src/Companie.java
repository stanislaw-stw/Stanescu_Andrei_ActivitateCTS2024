import java.util.List;

public class Companie {
    private List<IPersoana> angajati;

    public Companie(List<IPersoana> angajati) {
        this.angajati = angajati;
    }

    public int getNumarAngajati() {
        return angajati.size();
    }

    public int getVarstaMedieAngajati() {
        int sumaVarste = 0;
        for (IPersoana persoana : angajati) {
            sumaVarste += persoana.getVarsta();
        }
        return sumaVarste / angajati.size();
    }
}
