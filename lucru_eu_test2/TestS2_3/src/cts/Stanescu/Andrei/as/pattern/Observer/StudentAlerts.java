package cts.Stanescu.Andrei.as.pattern.Observer;

public class StudentAlerts implements Observer {
    private String nume;

    public StudentAlerts(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String message) {
        System.out.println("Alerta pentru studentul " + nume + ": " + message);
    }
}
