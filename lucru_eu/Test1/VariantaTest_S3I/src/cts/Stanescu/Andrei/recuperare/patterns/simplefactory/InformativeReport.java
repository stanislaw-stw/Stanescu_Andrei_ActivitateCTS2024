package cts.Stanescu.Andrei.recuperare.patterns.simplefactory;

public class InformativeReport implements FieldReport {
    @Override
    public void emitReport() {
        System.out.println("Emitting an informative report about the current field situation.");
    }
}
