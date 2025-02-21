package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
	//map to store robot of every type so that we don't need to create them again and again
	static Map<String, Robot> robotFactory=new HashMap<>();
	
	public static synchronized Robot getRobotFromFactory(String robotType) throws Exception
	{
		if(robotFactory.containsKey(robotType))
		{
			System.out.print("Using the existing Robot config and changing color");
			return robotFactory.get(robotType);
		}
		else {
			Robot robot;
			
			switch (robotType) 
			{
			case "SMALL": 
				System.out.println("We do not have Small Robot at present.So we are creating a small robot now.");
				robot = new SmallRobot();
				break;
			case "LARGE":
				System.out.println("We do not have Large Robot at present.So we are creating a large robot now.");
				robot = new LargeRobot();
				break;
			default:
				throw new Exception(" Robot Factory can create only small andlarge robots");
			}
			robotFactory.put(robotType, robot);
			return robot;
		}
	}
}
