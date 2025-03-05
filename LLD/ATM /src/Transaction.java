public abstract class Transaction {

    protected int transactionId;
    protected Account account;
    protected double amount;

    public Transaction(int transactionId, Account account, double amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.amount = amount;
    }

    public abstract void execute();
}
