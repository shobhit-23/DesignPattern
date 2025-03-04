package StatePattern;

public class Client {
	public static void main(String[] args)
	{
		VendingMachine vendingMachine=new VendingMachine();
		
		System.out.println("Normal Transcation---");
		
		vendingMachine.insertDollar();
		vendingMachine.dispense();
		
		System.out.println("Second Txn -----");
		
		vendingMachine.insertDollar();
		vendingMachine.insertDollar();
		vendingMachine.ejectMoney();
		vendingMachine.dispense();
		
		System.out.println("Thrid Txn -----");
		
		vendingMachine.insertDollar();
		vendingMachine.dispense();
		vendingMachine.ejectMoney();
		
	}
}
