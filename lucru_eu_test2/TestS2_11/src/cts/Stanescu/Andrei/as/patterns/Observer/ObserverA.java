package cts.Stanescu.Andrei.as.patterns.Observer;


public class ObserverA implements Observer {
    private String nume;

    public ObserverA(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(int numarPersoaneCoada) {
        System.out.println("Observer A - " + nume + ": Numarul de persoane în coada este " + numarPersoaneCoada);
    }
}

