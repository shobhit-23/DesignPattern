import Strategy.NoramlDriverStrategy;

public class GoodsVehicle extends Vehicle{
	
	public GoodsVehicle() {
		super(new NoramlDriverStrategy());
	}
}
