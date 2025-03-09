package carRentalSystem.payment;

public class CreditCardPaymentProcessor implements PaymentProcessor{
    @Override
    public boolean processPayment(double amount) {
        // Payment logic
        return true;
    }
}
