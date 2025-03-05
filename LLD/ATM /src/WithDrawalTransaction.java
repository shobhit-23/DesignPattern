public class WithDrawalTransaction extends Transaction{

    public WithDrawalTransaction(int transactionId, Account account, double amount) {
        super(transactionId, account, amount);
    }

    @Override
    public void execute() {
        account.debit(amount);
    }
}
