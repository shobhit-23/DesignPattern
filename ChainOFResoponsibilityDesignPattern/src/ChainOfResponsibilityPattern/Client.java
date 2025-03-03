package ChainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {

       // achieving chain of responsibility by setting up next processor
       LogProcessor logObject= new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

       logObject.log(LogProcessor.ERROR,"exception happened");
       logObject.log(LogProcessor.DEBUG,"need to debug this");
       logObject.log(LogProcessor.INFO,"just for Info");

    }
}
