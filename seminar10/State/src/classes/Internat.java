package classes;

public class Internat implements Stare{

    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
    }

    protected Internat() {
    }
}
