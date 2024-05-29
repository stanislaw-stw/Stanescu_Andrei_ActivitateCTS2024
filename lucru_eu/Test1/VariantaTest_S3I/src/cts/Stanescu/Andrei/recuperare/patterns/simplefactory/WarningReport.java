package cts.Stanescu.Andrei.recuperare.patterns.simplefactory;

public class WarningReport implements FieldReport {
    @Override
    public void emitReport() {
        System.out.println("Emitting a warning report about potential hazards in the field.");
    }
}