package Adapter.classes.metrou;

import java.util.GregorianCalendar;

public class AbonamentMetrou extends Calatorie {

    private GregorianCalendar dataExpirareAbonament;

    public AbonamentMetrou(String numeClient) {
        super(numeClient);
        this.dataExpirareAbonament = new GregorianCalendar();
    }

    @Override
    public boolean estePermisAccesl() {
        return this.dataExpirareAbonament.after(new GregorianCalendar());

    }
}
