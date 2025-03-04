package MementoOrSnapShotDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker 
{
	List<Memento> history= new ArrayList<>();
	
	public void addMemento(Memento memento)
	{
		history.add(memento);
	}
	
	public Memento undo()
	{
		if(!history.isEmpty())
		{
			int lastMementoIndex=history.size()-1;
			
			Memento lastMemento=history.get(lastMementoIndex);
			
			history.remove(lastMementoIndex);
			return lastMemento;
		}
		return null;
	}
}
