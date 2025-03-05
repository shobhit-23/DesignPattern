public class Client {
    public static void main(String[] args) {
        BankingService bankingService= new BankingService();
        CashDispenserService cashDispenserService= new CashDispenserService(10000);

        ATM atm=new ATM(bankingService,cashDispenserService);

        //create sample accounts
        bankingService.createAccount(1234,100);
        bankingService.createAccount(123,134);

        //Perform ATM operations
        Card card= new Card(1234,2909);
        atm.authenticateUser(card);

        // if authorized
        // check balanace
        double balance= atm.checkBalance(1234);
        System.out.println("Account Balance: "+balance);

        atm.withdrawCash(1234,50);
        atm.depositeCash(123,100);

        balance= atm.checkBalance(1234);
        System.out.println("Update Account balance: "+balance);
    }
}
