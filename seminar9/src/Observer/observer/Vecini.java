package Observer.observer;

public class Vecini implements Observer{
    private String nume;

    private float distantaBloc;

    public Vecini(String nume, float distantaBloc) {
        this.nume = nume;
        this.distantaBloc = distantaBloc;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume+" sala aflata la distanta de "+distantaBloc+" a trimis catre abonati urmatorul mesaj: "+mesaj);
    }
}
