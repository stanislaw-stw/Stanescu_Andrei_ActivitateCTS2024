package Command1.classes;

public class PachetCazare implements PachetTuristic{

    private int cod;

    public PachetCazare(int cod) {
        this.cod = cod;
    }

    @Override
    public void vanzere() {
        System.out.println("Pachetul de cazare cu codul " + cod + " a fost vandut.");
    }

    @Override
    public void rezervare() {
        System.out.println("Pachetul de cazare cu codul " + cod + " a fost rezervat.");
    }
}
