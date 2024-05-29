package cts.Stanescu.Andrei.recuperare.patterns.simplefactory;

import cts.Stanescu.Andrei.recuperare.patterns.simplefactory.fabrica.ReportFactory;
import cts.Stanescu.Andrei.recuperare.patterns.simplefactory.fabrica.ReportType;

public class Main {
    public static void main(String[] args) {
        ReportFactory factory = new ReportFactory();

        FieldReport report1 = factory.createReport(ReportType.INFORMATIVE);
        report1.emitReport();

        FieldReport report2 = factory.createReport(ReportType.WARNING);
        report2.emitReport();

        FieldReport report3 = factory.createReport(ReportType.ALERT);
        report3.emitReport();

        FieldReport anotherInformativeReport = factory.createReport(ReportType.INFORMATIVE);
        anotherInformativeReport.emitReport();
    }
}