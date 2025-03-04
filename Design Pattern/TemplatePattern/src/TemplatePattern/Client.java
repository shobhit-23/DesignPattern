package TemplatePattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("Generating PDF Report:");
        ReportGenerator pdfReport= new PDFReport();
        pdfReport.generateReport();

        System.out.println();

        System.out.println("Generaing CSV Report:");
        ReportGenerator csvReport= new CSVReport();
        csvReport.generateReport();
    }
}
