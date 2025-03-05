import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class ATM {
    private final BankingService bankingService;
    private final CashDispenserService cashDispenserService;
    private static final AtomicInteger transactionCounter = new AtomicInteger(0);

    public ATM(BankingService bankingService, CashDispenserService cashDispenserService) {
        this.bankingService = bankingService;
        this.cashDispenserService = cashDispenserService;
    }
    public void authenticateUser(Card card)
    {
        //write logic for card authentication
    }

    public double checkBalance(int accountNumber)
    {
        Account account=bankingService.getAccount(accountNumber);
        return account.getBalance();
    }
    public void withdrawCash(int accountNumber,double amount)
    {
        Account account=bankingService.getAccount(accountNumber);
        if(account!= null && account.getBalance()<amount)
        {
            System.out.println("Ooops!!! Insufficient Balance");
            return;
        }
        Transaction transaction= new WithDrawalTransaction(generateTransactionId(),account,amount);
        bankingService.processTransaction(transaction);
        cashDispenserService.dispenseCash(amount);
    }

    public void depositeCash(int accountNumber,double amount)
    {
        Account account=bankingService.getAccount(accountNumber);
        Transaction transaction= new DepositTransaction(generateTransactionId(),account,amount);
        bankingService.processTransaction(transaction);
    }
    private Integer generateTransactionId() {
        // Generate a unique transaction ID
        int transactionNumber = transactionCounter.incrementAndGet();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return transactionNumber;
    }
}
