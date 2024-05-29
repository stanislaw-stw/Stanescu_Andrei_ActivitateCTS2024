package cts.Stanescu.Andrei.recuperare.patterns.simplefactory.fabrica;

import cts.Stanescu.Andrei.recuperare.patterns.simplefactory.AlertReport;
import cts.Stanescu.Andrei.recuperare.patterns.simplefactory.FieldReport;
import cts.Stanescu.Andrei.recuperare.patterns.simplefactory.InformativeReport;
import cts.Stanescu.Andrei.recuperare.patterns.simplefactory.WarningReport;

public class ReportFactory {
    public FieldReport createReport(ReportType type) {
        switch (type) {
            case INFORMATIVE:
                return new InformativeReport();
            case WARNING:
                return new WarningReport();
            case ALERT:
                return new AlertReport();
            default:
                throw new IllegalArgumentException("Unknown report type: " + type);
        }
    }
}