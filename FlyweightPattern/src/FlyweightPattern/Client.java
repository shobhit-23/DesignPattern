package FlyweightPattern;

public class Client {
	public static void main(String args[]) throws Exception
	{
		RobotFactory robotFactory=new RobotFactory();
		
		Robot smallRobot=robotFactory.getRobotFromFactory("SMALL");
		smallRobot.showMe("Red");
		
		Robot largeRobot=robotFactory.getRobotFromFactory("LARGE");
		largeRobot.showMe("Blue");
		
		Robot smallRobot2=robotFactory.getRobotFromFactory("SMALL");
		smallRobot2.showMe("Pink");
		
		Robot largeRobot2=robotFactory.getRobotFromFactory("LARGE");
		largeRobot2.showMe("Orange");
	}
}
