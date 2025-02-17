import Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{

	public OffRoadVehicle() {
		super(new SportDriveStrategy());
	}
	
}
