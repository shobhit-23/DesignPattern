package VisitorDesignPattern;

public interface RoomElement {

	public void accept(RoomVisitor visitor);
}
