package CommandPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoteControlWithUndo {
	//for mulitple press save
	private List<Command> commands=new ArrayList<>(); 
	
	//for undo
	private Stack<Command> undoCommands=new Stack<>();
	
	public void addCommand(Command command)
	{
		commands.add(command);
	}
	
	public void executeCommands() {
		for(Command command:commands)
		{
			command.execute();
			undoCommands.add(command);
		}
		commands.clear();
	}
	
	public void undoLastCommand()
	{
		if(!undoCommands.isEmpty())
		{
			Command lastCommand= undoCommands.pop();
			lastCommand.undo();
		}
	}
}
