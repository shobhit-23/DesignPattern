import Strategy.DriverStrategy;

public class Vehicle {
	
	DriverStrategy driverStrategyobj;
	
	//constructor injection
	public Vehicle(DriverStrategy driverStrategyObj) {
		
		this.driverStrategyobj=driverStrategyObj;
	}
	
	public void drive() {
			driverStrategyobj.drive();
	}
	
}
