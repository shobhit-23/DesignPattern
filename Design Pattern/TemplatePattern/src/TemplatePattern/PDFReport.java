package TemplatePattern;

public class PDFReport extends ReportGenerator{
    @Override
    protected void processData() {
        System.out.println("Processing data for PDF format...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Formatting report as PDF...");
    }
}
