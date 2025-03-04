package VisitorDesignPattern;

public class RoomMaintenanceVisitor implements RoomVisitor{

	@Override
	public void visit(SingleRoom singleRoom) {
		
		System.out.println("Perfoming maintenance at Single Room");
	}

	@Override
	public void visit(DoubleRoom doubleRoom) {
		
		System.out.println("Perfoming maintenance at Double Room");
	}

	@Override
	public void visit(DeluxeRoom deluxeRoom) {
		
		System.out.println("Perfoming maintenance at Deluxe Room");
	}

}
