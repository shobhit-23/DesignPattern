package AirlineManagementSystem.payment;

public class PaymentProcessor {
    private static PaymentProcessor instance;

    public static synchronized PaymentProcessor getInstance()
    {
        if(instance== null)
            instance= new PaymentProcessor();
        return instance;
    }

    public void processPayment(Payment payment)
    {
        //Process payment using the selected payment method
        payment.processPayment();
    }
}
