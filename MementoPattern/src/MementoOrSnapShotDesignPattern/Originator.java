package MementoOrSnapShotDesignPattern;


public class Originator {
	
	int width;
	int height;
	
	public Originator(int height,int width) {
		this.height=height;
		this.width=width;
	}
	public void setHeight(int height)
	{
		this.height=height;
	}
	
	public void setWidth(int width)
	{
		this.width=width;
	}
	
	public Memento createMemento()
	{
		return new Memento(this.height,this.width);
	}
	
	public void restoreMemento(Memento mementoToBeRestored)
	{
		this.height=mementoToBeRestored.height;
		this.width=mementoToBeRestored.width;
	}
	
}
