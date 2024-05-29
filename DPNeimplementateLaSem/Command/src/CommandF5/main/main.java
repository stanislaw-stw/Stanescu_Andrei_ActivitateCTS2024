package CommandF5.main;

import CommandF5.classes.*;

public class main {
    public static void main(String[] args) {
        Usa usaFata = new Usa("fata");
        Usa usaMijloc = new Usa("mijloc");
        Usa usaSpate = new Usa("spate");

        Sofer sofer = new Sofer();

        Command deschideUsiFortatFata = new DeschideUsiFortatCommand(usaFata);
        Command deschideUsiFortatMijloc = new DeschideUsiFortatCommand(usaMijloc);
        Command deschideUsiFortatSpate = new DeschideUsiFortatCommand(usaSpate);

        Command puneUsiInModLiberFata = new PuneUsiInModLiberCommand(usaFata);
        Command puneUsiInModLiberMijloc = new PuneUsiInModLiberCommand(usaMijloc);
        Command puneUsiInModLiberSpate = new PuneUsiInModLiberCommand(usaSpate);

        sofer.adaugaComanda(deschideUsiFortatFata);
        sofer.adaugaComanda(deschideUsiFortatMijloc);
        sofer.adaugaComanda(deschideUsiFortatSpate);

        sofer.executaComenzi();

        sofer.adaugaComanda(puneUsiInModLiberFata);
        sofer.adaugaComanda(puneUsiInModLiberMijloc);
        sofer.adaugaComanda(puneUsiInModLiberSpate);

        sofer.executaComenzi();
    }
}
