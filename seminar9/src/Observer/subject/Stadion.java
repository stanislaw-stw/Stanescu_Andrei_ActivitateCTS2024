package Observer.subject;

public class Stadion extends Subject{
    @Override
    public void notificaMeciFotbal() {
        super.notificaAbonati("Azi are loc un meci de fotbal");
    }

    @Override
    public void notificaMeciVolei() {
        super.notificaAbonati("Va avea loc un meci de volei pe stadion");
    }

    @Override
    public void notificaMeciHandbal() {
        super.notificaAbonati("Pe stadion are loc un meci de handbal feminin");
    }

    public void notificaConcert(){
        super.notificaAbonati("Astazi pe stadion vor canta mai multe formatii");
    }
}
