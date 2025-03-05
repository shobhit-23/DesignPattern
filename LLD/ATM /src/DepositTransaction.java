public class DepositTransaction extends Transaction{

    public DepositTransaction(int transactionId, Account account, double amount) {
        super(transactionId, account, amount);
    }

    @Override
    public void execute() {
        account.debit(amount);
    }
}
