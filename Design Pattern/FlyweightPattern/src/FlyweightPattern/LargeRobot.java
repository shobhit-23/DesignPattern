package FlyweightPattern;

public class LargeRobot implements Robot{
	/*
	 * Intrinsic state.
	 * It is not supplied by client.
	 * So, it is independent of the flyweight’s context.
	 * This can be shared across.
	 * These data are often immutable.
	 */
	
	private final String robotSize;
	//There are be many other properties and functioalities 
	// of robot that will be common to all
	public LargeRobot()
	{
		robotSize="Large Type robot";
		System.out.print(robotSize + "created ");
	}
	@Override
	public void showMe(String color) {
		System.out.println(" with "+ color +" color");
		
	}
}
