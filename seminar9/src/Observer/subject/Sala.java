package Observer.subject;

public class Sala extends Subject{
    @Override
    public void notificaMeciFotbal() {
        String mesaj="Va avea loc un meci de fotbal in data de 23 la ora 18";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj="Va avea loc un meci de volei in data de 22 la ora 19";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciHandbal() {
        String mesaj="Va avea loc un meci de handbal in data de 21 la ora 18";
        notificaAbonati(mesaj);
    }
}
