import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankingService {
    private final Map<Integer,Account> accounts= new ConcurrentHashMap<>();

    public void createAccount(int accountNumber, double initialAmount)
    {
        accounts.put(accountNumber,new Account(accountNumber,initialAmount));
    }
    public Account getAccount(int accountNumber)
    {
        return accounts.get(accountNumber);
    }
    public void processTransaction(Transaction transaction)
    {
        transaction.execute();
    }
}
