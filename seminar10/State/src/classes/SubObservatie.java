package classes;

public class SubObservatie implements Stare{
    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
    }

    protected SubObservatie() {
    }
}
