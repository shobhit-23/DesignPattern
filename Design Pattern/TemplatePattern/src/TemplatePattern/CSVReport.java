package TemplatePattern;

public class CSVReport extends ReportGenerator{
    @Override
    protected void processData() {
        System.out.println("Processing data for CSV format...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Formatting report as CSV...");
    }
}
