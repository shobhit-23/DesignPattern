public class CashDispenserService {
    private double cashAvailable;

    public CashDispenserService(double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public synchronized void dispenseCash(double amount)
    {
        if(amount> cashAvailable)
        {
            throw new IllegalArgumentException("Insufficient cash!!!");
        }
        cashAvailable-=amount;
        System.out.println("Dispensing cash of amount:"+ amount);
    }
}
