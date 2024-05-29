package cts.Stanescu.Andrei.recuperare.patterns.simplefactory;

public class AlertReport implements FieldReport {
    @Override
    public void emitReport() {
        System.out.println("Emitting an alert report about imminent dangers in the field.");
    }
}