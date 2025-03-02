package CommandPattern;

public class Client {
	public static void main(String args[])
	{
		
		//Set up the receiver
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight= new Light("Kitchen");
		
		//Create concrete commands
		Command livingRommLightOnCommand= new LightOnCommand(livingRoomLight);
		Command livingRoomLightOffCommand= new LightOffCommand(livingRoomLight);
		Command kitchenLightOnCommand= new LightOnCommand(kitchenLight);
		Command kitchneLightOffCommand= new LightOffCommand(kitchenLight);
		
		//Set up the invoker
		RemoteControl remoteControl=new RemoteControl();
		
		//Use the invoker to execute commands
		remoteControl.setCommand(livingRommLightOnCommand);
		remoteControl.pressButton();
		remoteControl.setCommand(kitchenLightOnCommand);
		remoteControl.pressButton();
		remoteControl.setCommand(kitchneLightOffCommand);
		remoteControl.pressButton();
		remoteControl.setCommand(livingRoomLightOffCommand);
		remoteControl.pressButton();
		
		
		//Demo
		System.out.println();
		System.out.println("------Demo with normal remote:-----");
		remoteControl.setCommand(kitchenLightOnCommand);
		remoteControl.pressButton();
		remoteControl.preseUndoButton();
		
		
		//Demo with Undo button remote
		System.out.println();
		RemoteControlWithUndo remoteControlWithUndo=new RemoteControlWithUndo();
		System.out.println("------Demo with UndoFeature Remote:------");
		remoteControlWithUndo.addCommand(livingRommLightOnCommand);
		remoteControlWithUndo.addCommand(kitchenLightOnCommand);
		remoteControlWithUndo.executeCommands();
		remoteControlWithUndo.undoLastCommand();
		remoteControlWithUndo.undoLastCommand();
	}
}
