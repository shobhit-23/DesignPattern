package MementoOrSnapShotDesignPattern;

public class Client {
	public static void main(String args[])
	{
		CareTaker careTaker=new CareTaker();
		
		Originator originator=new Originator(5, 10);
		
		// Save a snap of current state
		Memento snapshot1=originator.createMemento();
		
		//add it to history
		careTaker.addMemento(snapshot1);
		
		//originator changing to new state
		originator.setHeight(7);
		originator.setWidth(12);
		
		//save again
		Memento snapshot2=originator.createMemento();
		
		//add to history
		careTaker.addMemento(snapshot2);
		
		//new state
		originator.setHeight(9);
		originator.setWidth(14);
		
		//UNDO
		Memento restoredStateMemento= careTaker.undo();
		originator.restoreMemento(restoredStateMemento);
		
		System.out.println("height: "+originator.height +" widht: "+originator.width);
	}
}
