package TemplatePattern;

public abstract class ReportGenerator {

    public final void generateReport()
    {
        //steps to do for generating Report
        fetchData();
        processData();
        formatReport();
        saveReport();
    }
    //common method (Implement in base class)
    private void fetchData()
    {
        System.out.println("Fetching Data from database...");
    }

    //Abstract methods (subclasses must implement)
    protected  abstract void processData();
    protected  abstract void formatReport();

    //common method
    private void saveReport()
    {
        System.out.println("Saving report to file.");
    }

}
