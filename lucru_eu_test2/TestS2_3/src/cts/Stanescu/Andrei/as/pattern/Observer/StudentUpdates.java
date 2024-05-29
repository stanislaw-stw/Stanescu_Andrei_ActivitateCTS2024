package cts.Stanescu.Andrei.as.pattern.Observer;

public class StudentUpdates implements Observer {
    private String nume;

    public StudentUpdates(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String message) {
        System.out.println("Actualizare academica pentru " + nume + ": " + message);
    }
}
