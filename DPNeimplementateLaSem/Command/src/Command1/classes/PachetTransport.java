package Command1.classes;

public class PachetTransport implements PachetTuristic{

    private int cod;

    public PachetTransport(int cod) {
        this.cod = cod;
    }

    @Override
    public void vanzere() {
        System.out.println("pachetul de transport cu codul " + cod + " a fost vandut.");
    }

    @Override
    public void rezervare() {
        System.out.println("Pachetul de transport cu codul " + cod + " a fost rezervat.");
    }
}
