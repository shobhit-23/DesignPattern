package carRentalSystem.payment;

public class PaypalPaymentProcessor implements  PaymentProcessor{
    @Override
    public boolean processPayment(double amount) {
        // Implement PayPal payment logic
        return true;
    }
}
