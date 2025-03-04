package StatePattern;

import java.io.CharConversionException;

public class HasMoneyState implements State{

	@Override
	public void insertDollar(VendingMachine context) {
		System.out.println("Already have a dollar");
	}

	@Override
	public void ejectMoney(VendingMachine context) {
		System.out.println("Return dollar");
		context.setState(new NoMoneyState());
	}

	@Override
	public void dispense(VendingMachine context) {
		System.out.println("Releasing product");
		context.setState(new NoMoneyState());
	}

}
